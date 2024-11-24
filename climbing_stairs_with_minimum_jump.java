public class climbing_stairs_with_minimum_jump {
    static int function(int[] array){
        int n = array.length;
        Integer[] dp = new Integer[n+1];
        dp[n] = 0;
        for (int i = n-1; i >= 0; i--) {
          if (array[i] != 0){
              int min = Integer.MAX_VALUE;
              for (int j = 1; j <= array[i] && i+j < dp.length ; j++) {
                  if (dp[i+j] != null){
                      min = Math.min(min,dp[i+j]);
                  }
              }
              if (min == Integer.MAX_VALUE){
                  dp[i] = null;
              }
              else dp[i] = 1 + min;
          }
        }
        int ans = dp[0];
        return ans;
    }
//recursion
//    static int recursion(int i,int[] cost,int n){
//        if(i == n)return 0;
//        int one_jump = cost[i];
//        int two_jump = cost[i];
//        one_jump = recursion(i+1,cost,n) + cost[i];
//        if(i+2 <= n){
//            two_jump = recursion(i+2,cost,n) + cost[i];
//        }
//        return Math.min(one_jump,two_jump);
//    }
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        return Math.min(recursion(0,cost,n),recursion(1,cost,n));
//    }


//    recursion with dp

//    static int recursion(int i,int[] cost,int n,int[]dp){
//        if(i == n)return 0;
//        int one_jump = cost[i];
//        int two_jump = cost[i];
//        if(dp[i] != -1)return dp[i];
//        one_jump = recursion(i+1,cost,n,dp) + cost[i];
//        if(i+2 <= n){
//            two_jump = recursion(i+2,cost,n,dp) + cost[i];
//        }
//        dp[i] = Math.min(one_jump,two_jump);
//        return Math.min(one_jump,two_jump);
//    }
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        int[] dp = new int[n];
//        for(int i = 0; i<n;i++){
//            dp[i] = -1;
//        }
//        return Math.min(recursion(0,cost,n,dp),recursion(1,cost,n,dp));
//    }

//tabulation with space

//    static int tabulation(int[] cost,int i,int n,int[]dp){
//        dp[n-1] = cost[n-1];
//
//        for(int j = n-2;j >= i;j--){
//            int one_jump = cost[j];
//            int two_jump = cost[j];
//            one_jump = dp[j+1] + cost[j];
//            if(j+2 < n){
//                two_jump = dp[j+2] + cost[j];
//            }
//            dp[j] = Math.min(one_jump,two_jump);
//        }
//        return dp[i];
//    }
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        int[] dp = new int[n];
//        return Math.min(tabulation(cost,0,n,dp),tabulation(cost,1,n,dp));
//    }

// tabulation without space

//    static int tabulation(int[] cost,int i,int n){
//        int p1 = cost[n-1];
//        int p2 = 0;
//        for(int j = n-2;j >= i;j--){
//            int one_jump = cost[j];
//            int two_jump = cost[j];
//            one_jump = p1 + cost[j];
//            if(j+2 < n){
//                two_jump = p2 + cost[j];
//            }
//            int curr = Math.min(one_jump,two_jump);
//            p2 = p1;
//            p1 = curr;
//        }
//        return p1;
//    }
//    public int minCostClimbingStairs(int[] cost) {
//        int n = cost.length;
//        return Math.min(tabulation(cost,0,n),tabulation(cost,1,n));
//    }


    public static void main(String[] args) {
        int[] array = {3,2,4,2,0,2,3,1,2,2};
        System.out.println(function(array));
    }
}
