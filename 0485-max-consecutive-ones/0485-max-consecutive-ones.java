class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0, currentLength = 0;
        for (int num : nums) {
            if (num == 1) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }
}