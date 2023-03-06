public class firstAndLast {
    static void printNo(int n){
        if(n==0){
            return;
        }
        printNo(n-1);
        System.out.println(n);
    }
    static int factorial(int n){
        if(n ==0){
            return 0;
        }
        int res = n;
        res *= factorial(n-1);
        return res;
    }
    // static int sumOfN(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int i = n;
    //     i += sumOfN(n-1);
    //     return i;
    // }
    // static int productOfN(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     int i = n;
    //     i *= productOfN(n-1);
    //     return i;
    // }
    static double reverseNumber(Double n){
        if(n<10){
            return n;
        }
        int count =0;
       while(n >= 10){
        count++;
        n /= 10; 
       }
       double rem = n%10;
       double mainNum = rem  *  Math.pow(10, count) + reverseNumber(n/10);
       return mainNum;
    }

   public static void main(String[] args) {
    int a = 10;
    // printNo(a);
    // int res = factorial(0);
    // System.out.println(res);
    double res = reverseNumber(312.00);
    System.out.println(res);
   } 
}