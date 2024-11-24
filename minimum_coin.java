public class minimum_coin {
//    recursion

//    static int recursion(int[]num,int x){
//        if(x == 0)return 0;
//        if(x < 0)return Integer.MAX_VALUE;
//        int min_ith = Integer.MAX_VALUE;
//        for(int i : num){
//            int recursion_i = recursion(num,x-i);
//            if(recursion_i != Integer.MAX_VALUE){
//                min_ith = Math.min(min_ith,recursion_i + 1);
//            }
//        }
//        return min_ith;
//    }
//    public static int minimumElements(int num[], int x) {
//        // Write your code here..
//        int result =  recursion(num, x);
//        return (result == Integer.MAX_VALUE) ? -1 : result;
//    }

//    recursion with dp

//static int recursion(int[]num,int x,int[] dp){
//    if(x == 0)return 0;
//    if(x < 0)return Integer.MAX_VALUE;
//    if(dp[x] != -1)return dp[x];
//    int min_ith = Integer.MAX_VALUE;
//    for(int i : num){
//        int recursion_i = recursion(num,x-i,dp);
//        if(recursion_i != Integer.MAX_VALUE){
//            min_ith = Math.min(min_ith,recursion_i + 1);
//        }
//    }
//    dp[x] = min_ith;
//    return min_ith;
//}
//    public static int minimumElements(int num[], int x) {
//        // Write your code here..
//        int[] dp = new int[x+1];
//        for(int i = 0;i < x+1;i++){
//            dp[i] = -1;
//        }
//        int result =  recursion(num, x,dp);
//        return (result == Integer.MAX_VALUE) ? -1 : result;
//    }

    static int tabulation(int[]num,int x){
        int[] dp = new int[x+1];
        for(int i = 0;i < x+1;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for(int i = 1;i < x+1;i++){
            for(int j = 0;j < num.length;j++){
                if(i-num[j] >= 0 && dp[i-num[j]] != Integer.MAX_VALUE){ // for x = 6 and num[] = {17,10,6} dp[i-num[j]] != Integer.MAX_VALUE is essential
                    dp[i] = Math.min(dp[i],1 + dp[i - num[j]]);
                }
            }
        }
        if(dp[x] == Integer.MAX_VALUE)return -1;
        return dp[x];
    }
    public static int minimumElements(int num[], int x) {
        // Write your code here..
        int ans = tabulation(num,x);
        if(ans == Integer.MAX_VALUE)return -1;
        return ans;
    }
    public static void main(String[] args) {

    }
}
