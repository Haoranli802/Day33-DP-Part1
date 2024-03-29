class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp0 = cost[0];
        int dp1 = cost[1];
        for(int i = 2; i < cost.length; i++){
            int temp = dp1;
            dp1 = Math.min(dp0, dp1) + cost[i];
            dp0 = temp;
        }
        return Math.min(dp0, dp1);
    }
}
//O(N), O(1)
