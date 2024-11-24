public class count_dearrangement {
//    recursion

//    public static long countDerangements(int n) {
//        // Write your code here.
//        if(n == 1)return 0;
//        if(n == 2)return 1;
//        long ans = (n-1) * (countDerangements(n-1) + countDerangements(n-2));
//        return ans % (1000000007);
//
//    }

//recursion + dp

//    static long recursion(int n,long[] dp){
//        if(n == 1)return 0;
//        if(n == 2)return 1;
//        if(dp[n] != -1)return dp[n];
//        long ans = (n-1) * (countDerangements(n-1) + countDerangements(n-2));
//        dp[n] = ans % (1000000007);
//        return dp[n];
//    }
//    public static long countDerangements(int n) {
//        // Write your code here.
//        long[] dp = new long[n+1];
//        for(int i = 0;i < n+1;i++){
//            dp[i] = -1;
//        }
//        return recursion(n,dp);
//    }

//    tabulation + dp

//    static long mod = 1000000007;
//    public static long countDerangements(int n) {
//        // Write your code here.
//        long[] dp = new long[n+1];
//        for(int i = 0;i < n+1;i++){
//            dp[i] = -1;
//        }
//        dp[1] = 0;
//        dp[2] = 1;
//        for(int i = 3;i < n+1;i++){
//            dp[i] = ((i-1) * (dp[i-1] + dp[i-2])%mod)%mod;
//        }
//        return dp[n];
//    }

//tabulation without space

//static long mod = 1000000007;
//    public static long countDerangements(int n) {
//        // Write your code here.
//        long p2 = 0;
//        long p1 = 1;
//        for(int i = 3;i < n+1;i++){
//            long curr = ((i-1) * (p1 + p2)%mod)%mod;
//            p2 = p1;
//            p1 = curr;
//        }
//        return p1;
//    }


    public static void main(String[] args) {

    }
}
