public class house_robber_II {
    static long recursion(int[] nums, int start, int end) {
        long p1 = nums[end]; // Start with the last house
        long p2 = 0;         // No house to include initially

        for (int i = end - 1; i >= start; i--) {
            long include = nums[i];
            if (i + 2 <= end) {
                include += p2; // Add the value two houses ahead if valid
            }
            long exclude = p1;   // Skip the current house
            long curr = Math.max(include, exclude);

            p2 = p1;            // Update for the next iteration
            p1 = curr;
        }

        return p1;       // Return the maximum sum
    }
    public static long houseRobber(int[] valueInHouse) {
        int n = valueInHouse.length;
        if (n == 1) return valueInHouse[0]; // Only one house to rob

        // Exclude the first house
        long excludeFirst = recursion(valueInHouse, 1, n - 1);
        // Exclude the last house
        long excludeLast = recursion(valueInHouse, 0, n - 2);

        // Return the maximum of the two cases
        return Math.max(excludeFirst, excludeLast);
    }
}
