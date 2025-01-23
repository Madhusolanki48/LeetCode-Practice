class Solution {
    public int[] intersection(int[] nums1, int[] nums2) { 
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int element: nums1){
            set.add(element);
        }
        for(int element : nums2){
            if(set.contains(element)){
                result.add(element);
            }
        }
        int res[] = new int[result.size()];
        int i = 0;
        for(int element : result){
            res[i++] = element;
        }
        return res;
    }
}