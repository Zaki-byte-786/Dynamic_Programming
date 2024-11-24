import java.util.*;
public class Maximum_sum_of_non_adjacent_elements {
//    static int recursion(ArrayList<Integer> nums,int i){
//        if(nums.size()-1 == i)return nums.get(i);
//        if(i >= nums.size())return 0;
//        int include = recursion(nums,i+2) + nums.get(i);
//        int exclude = recursion(nums,i+1);
//        return Math.max(include,exclude);
//    }


//    recursion+memoization

//static int recursion(ArrayList<Integer> nums,int i,int n,int[]dp){
//    if(i >= n){
//        return 0;
//    }
//    if(dp[i] != -1)return dp[i];
//    int include = recursion(nums,i+2,n,dp) + nums.get(i);
//    int exclude = recursion(nums,i+1,n,dp);
//    dp[i] = Math.max(include,exclude);
//    return Math.max(include,exclude);
//}
//    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
//        // Write your code here.
//        int[] dp = new int[nums.size()+1];
//        for(int i = 0;i <= nums.size();i++){
//            dp[i] = -1;
//        }
//        return recursion(nums,0,nums.size(),dp);
//    }

//tabulation with space

//    static int recursion(ArrayList<Integer> nums,int n){
//        int[] dp = new int[n];
//        dp[n-1] = nums.get(n-1);
//        for(int i = n-2;i >= 0;i--){
//            int include = nums.get(i);
//            if(i+2 < n){
//                include = dp[i+2] + nums.get(i);
//            }
//            int exclude = dp[i+1];
//            dp[i] = Math.max(include,exclude);
//        }
//        return dp[0];
//    }
//    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
//        // Write your code here.
//        return recursion(nums,nums.size());
//    }
//tabulation without space

    static int recursion(ArrayList<Integer> nums,int n){
        int p1 = nums.get(n-1);
        int p2 = 0;
        for(int i = n-2;i >= 0;i--){
            int include = nums.get(i);
            if(i+2 < n){
                include = p2 + nums.get(i);
            }
            int exclude = p1;
            int curr = Math.max(include,exclude);
            p2 = p1;
            p1 = curr;
        }
        return p1;
    }
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        // Write your code here.
        return recursion(nums,nums.size());
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(9);
        nums.add(9);
        nums.add(8);
        nums.add(2);
        System.out.println(maximumNonAdjacentSum(nums));
    }
}
