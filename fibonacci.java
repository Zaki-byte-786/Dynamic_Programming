public class fibonacci {

    // using recursion


//    static int fibonacciNthTerm(int n){
//        if(n == 0 || n == 1)return n;
//        int fib1 = fibonacciNthTerm(n-1);
//        int fib2 = fibonacciNthTerm(n-2);
//        int fib = fib1 + fib2;
//        return fib;
//    }


//    using DP
    static int helper(int n,int[] array){
        if (n == 0 || n == 1)return n;
        if (array[n] != 0)return array[n];
        int fib1 = helper(n-1,array);
        int fib2 = helper(n-2,array);
        int ans = fib1 + fib2;
        array[n] = ans;
        return ans;
    }
    static int fibonacciNthTerm(int n){
        int[] array = new int[n+1];
        return helper(n,array);
    }
    public static void main(String[] args) {
        System.out.println(fibonacciNthTerm(5));
        
    }
}
