class Solution {
  public static boolean isPrime(int num) {
     if (num <= 1) return false;     
     for (var i=2; i <= Math.sqrt(num); i++)
       if (num % i == 0) return false;
       
     return true;
  }
  
  public int diagonalPrime(int[][] nums) {
    var n = nums.length;
    var ans = 0;    
    for (var i=0; i<n; i++) {
      if (isPrime(nums[i][i]))
        ans = Math.max(ans, nums[i][i]);      
      if (isPrime(nums[i][n-1-i]))
        ans = Math.max(ans, nums[i][n-1-i]);
    }
    return ans;
  }
}