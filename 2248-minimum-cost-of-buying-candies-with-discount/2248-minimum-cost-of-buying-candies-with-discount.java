import java.util.Arrays;
class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int totalCost = 0;
        int n = cost.length;
        
        for (int i = n - 1; i >= 0; i -= 3) {
            totalCost += cost[i];
            if (i - 1 >= 0) 
            totalCost += cost[i - 1];
            }
        
        return totalCost;
    }
}