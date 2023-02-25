package D2;

import java.util.Scanner;

public class Q2 {

    public static int PowerFun(int x,int n) {
        if(n == 1){
            return x;
        }
        int Powernm1 = PowerFun(x, n-1);
        int Power   = x * Powernm1;
        return Power;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X");
        int X  = sc.nextInt();
        System.out.println("Enter the value of N");
        int N  = sc.nextInt();
        int ans = PowerFun(X, N);
        System.out.println(ans);
        sc.close();
    }
}
