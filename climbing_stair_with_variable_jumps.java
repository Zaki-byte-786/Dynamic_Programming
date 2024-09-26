public class climbing_stair_with_variable_jumps {
    static int function(int[] array){
        int n = array.length;
        int[] dp = new int[n+1];
        dp[n] = 1;
        for (int i = n-1; i >= 0 ; i--){
            for (int j = 1; j <= array[i] && i+j < dp.length ; j++) dp[i] += dp[i+j];
        }
        return dp[0];
    }
    public static void main(String[] args) {
        int[] array = {3,3,0,2,2,3};
        System.out.println(function(array));
    }
}
