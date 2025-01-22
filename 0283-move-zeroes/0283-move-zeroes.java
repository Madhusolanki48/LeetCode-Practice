class Solution {
     public void moveZeroes(int[] nums) {
        int move = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                move++; 
            }
            else if (move > 0) {
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-move]=t;
            }
        }
    }
}