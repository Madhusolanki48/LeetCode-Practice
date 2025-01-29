class Solution {
    public void rev(int s,int e,int []nums){
        while(s<e){
            int a=nums[s];
            nums[s]=nums[e];
            nums[e]=a;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
       int []ans=new int[n];
        int idx=-1;
        for (int i = n - 2; i >= 0; i--) { 
            if (nums[i] < nums[i + 1]) {     
                idx=i;
                break;                   
            }
        }
        if(idx==-1){
            rev(0,n-1,nums);
            return ;}
        int b=n-1;
        while(true){
            if(nums[b]>nums[idx]){
                break;
            }
            b--;
        }
        int a=nums[idx];
        nums[idx]=nums[b];
        nums[b]=a;
        rev(idx+1,n-1,nums);
        }
}