public class cut_into_segment_rod {
    // recursion

//    static int recursion(int n,int x,int y,int z){
//        if(n == 0)return 0;
//        if(n < 0)return Integer.MIN_VALUE;
//        int x_segment = recursion(n-x,x,y,z);
//        int y_segment = recursion(n-y,x,y,z);
//        int z_segment = recursion(n-z,x,y,z);
//        return 1 + Math.max(x_segment,Math.max(y_segment,z_segment));
//    }
//    public static int cutSegments(int n, int x, int y, int z) {
//        // Write your code here.
//        int ans = recursion(n,x,y,z);
//        if(ans < 0)return 0;
//        return ans;
//    }

    //recursion with dp

//    static int recursion(int n,int x,int y,int z,int[]dp){
//        if(n == 0)return 0;
//        if(n < 0)return Integer.MIN_VALUE;
//        if(dp[n] != Integer.MIN_VALUE)return dp[n];
//        int x_segment = recursion(n-x,x,y,z,dp);
//        int y_segment = recursion(n-y,x,y,z,dp);
//        int z_segment = recursion(n-z,x,y,z,dp);
//        int ans = 1 + Math.max(x_segment,Math.max(y_segment,z_segment));
//        dp[n] = ans;
//        return ans;
//    }
//    public static int cutSegments(int n, int x, int y, int z) {
//        // Write your code here.
//        int[] dp = new int[n+1];
//        for(int i = 0; i < n+1;i++){
//            dp[i] = Integer.MIN_VALUE;
//        }
//        int ans = recursion(n,x,y,z,dp);
//        if(ans < 0)return 0;
//        return ans;
//    }

//tabulation

//    public static int cutSegments(int n, int x, int y, int z) {
//        // Write your code here.
//        int[] dp = new int[n+1];
//        for(int i = 0;i < n+1;i++){
//            dp[i] = Integer.MIN_VALUE;
//        }
//        int[] num = {x,y,z};
//        dp[0] = 0;
//        for(int i = 1;i < n+1;i++){
//            for(int j = 0;j < num.length;j++){
//                if(i-num[j] >= 0 && dp[i-num[j]] != Integer.MIN_VALUE){
//                    dp[i] = Math.max(dp[i],dp[i-num[j]] +1);
//                }
//            }
//        }
//        return dp[n] == Integer.MIN_VALUE ? 0 : dp[n];
//    }



}
