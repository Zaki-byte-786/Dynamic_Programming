
public class frog_jump {

    //recursion + memoization

//    static int recursion(int i,int[] heights,int n,int[] dp){
//    if(i == n-1)return 0;
//    int one_jump = Integer.MAX_VALUE;
//    int two_jump = Integer.MAX_VALUE;
//    if(dp[i] != -1)return dp[i];
//    if(i+1 < n){
//        one_jump = recursion(i+1,heights,n,dp) + Math.abs(heights[i] - heights[i+1]);
//    }
//    if(i+2 < n){
//        two_jump = recursion(i+2,heights,n,dp) + Math.abs(heights[i] - heights[i+2]);
//    }
//    dp[i] = Math.min(one_jump,two_jump);
//    return Math.min(one_jump,two_jump);
//}
//static int frogJump(int n, int heights[]) {
//        int[] dp = new int[n+1];
//        for(int i = 0; i < n+1;i++){
//            dp[i] = -1;
//        }
//        return recursion(0,heights,n,dp);
//        // Write your code here..
//    }


//tabulation with space

//public static int frogJump(int n, int heights[]) {
//int jump_one = Integer.MAX_VALUE;
//int jump_two = Integer.MAX_VALUE;
//    // Write your code here..
//    int[] dp = new int[n];
//    dp[n-1] = 0;
//    for(int i = n-2;i >= 0;i--){
//         jump_one = dp[i+1] + Math.abs(heights[i] - heights[i+1]);
//        if(i+2 < n){
//            jump_two = dp[i+2] + Math.abs(heights[i] - heights[i+2]);
//        }
//        dp[i] = Math.min(jump_one,jump_two);
//    }
//    return dp[0];
//}

// tabulation without space

    public static int frogJump(int n, int heights[]) {
        int jump_one = Integer.MAX_VALUE;
        int jump_two = Integer.MAX_VALUE;
        // Write your code here..
        int p1 = 0,p2 = 0,curr = 0;
        for(int i = n-2;i >= 0;i--){
            jump_one = p1 + Math.abs(heights[i] - heights[i+1]);
            if(i+2 < n){
                jump_two = p2 + Math.abs(heights[i] - heights[i+2]);
            }
             curr = Math.min(jump_one,jump_two);
            p2 = p1;
            p1 = curr;
        }
        return curr;
    }
    public static void main(String[] args) {
    }
}
