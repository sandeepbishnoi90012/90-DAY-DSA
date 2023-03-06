

import java.util.Scanner;

public class AtoPowerB {
    // !this is linear recursion to solve a^b;
    // static int AtoPower_B(int a, int b, int i) {
    //     if (i == b) {
    //         return a;
    //     } else {
    //         int res = a;
    //         res *= AtoPower_B(a, b, i + 1);
    //         return res;
    //     }
    // }
    // !this is binary recursion to solve a^b;
    static int AtoPower_B(int a, int b) {
        if (b ==0) {
            return 1;
        }
        int res = 1;
        if((b&1) == 0){
            res *= AtoPower_B(a, b/2) * AtoPower_B(a, b/2);
            return res;
        }else{
         res *= a * AtoPower_B(a, b/2) * AtoPower_B(a, b/2);   
         return res;
        }
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();;
    int res = AtoPower_B(a, b);
    System.out.println(res);
    }
}
