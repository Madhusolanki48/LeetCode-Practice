class Solution {
    public int missingNumber(int[] nums) {
        int arrLength = 0;
        int arrSum = 0;
        for(int i=1;i<=nums.length;i++){
            arrSum = arrSum + nums[i-1];
            arrLength = arrLength + i;
        }
        return arrLength-arrSum;
    }
}