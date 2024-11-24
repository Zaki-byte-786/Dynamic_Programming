public class Ninja_s_Training {
    static int recursion(int day, int task, int[][] points, int n, int[][] dp) {
        // Base case: when on the last day
        if (day == 0) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                if (i != task) { // Consider all tasks except the restricted one
                    max = Math.max(max, points[day][i]);
                }
            }
            return max;
        }

        // If result for this state is already calculated
        if (task != -1 && dp[day][task] != -1) {
            return dp[day][task];
        }

        // Calculate the maximum points for this day
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            if (i != task) { // Avoid repeating the same task
                int currentPoints = points[day][i] + recursion(day - 1, i, points, n, dp);
                max = Math.max(max, currentPoints);
            }
        }

        // Store the result for memoization
        if (task != -1) {
            dp[day][task] = max;
        }

        return max;
    }

    public static int ninjaTraining(int n, int[][] points) {
        // Initialize the DP array
        int[][] dp = new int[n][4];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }

        // Start recursion with no restricted task (-1)
        return recursion(n-1, -1, points, n, dp);
    }
}
