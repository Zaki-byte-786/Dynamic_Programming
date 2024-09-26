public class stair_climbing {
//    using recursion
    static int f1(int n){
        if (n == 0)return 1;
        if (n < 0)return 0;
        int step1 = f1(n-1);  // we believe that this line will give all possible way to reach 0 from n-1
        int step2 = f1(n-2);  // we believe that this line will give all possible way to reach 0 from n-2
        int step3 = f1(n-3);  // we believe that this line will give all possible way to reach 0 from n-3
        return step1 + step2 + step3;
    }

// using memoization to avoid repetition
static int helper(int n,int[] array){
    if (n == 0)return 1;
    if (n < 0)return 0;
    if (array[n] != 0)return array[n]; // it will avoid repetitive calculation
    int step1 = helper(n-1,array);  // we believe that this line will give all possible way to reach 0 from n-1
    int step2 = helper(n-2,array);  // we believe that this line will give all possible way to reach 0 from n-2
    int step3 = helper(n-3,array);  // we believe that this line will give all possible way to reach 0 from n-3
    array[n] = step1 + step2 + step3; // it will store the value for each n
    return step1 + step2 + step3;
}
static int f2(int n){
        int[] array = new int[n+1];
       return helper(n,array);
}
// using tabulation
static int f3(int n){
        int[] array = new int[n+1];
    if(n == 0)return 1;
    if(n == 1)return 1;
    if(n == 2)return 2;
    array[0] = 1;
    array[1] = 1;
    array[2] = 2;
    for (int i = 3; i <= n ; i++) {
        array[i] = array[i-1] + array[i-2] + array[i-3];
    }
    return array[n];
}
    public static void main(String[] args) {
        System.out.println(f3(5));
    }
}
