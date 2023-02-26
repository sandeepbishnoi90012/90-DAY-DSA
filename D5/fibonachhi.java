package D5;

import java.util.Scanner;

public class fibonachhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        // for(int i = 1;i <=n;i++){
        //     int nextFibNum = a+b;
        //     System.out.println(nextFibNum);
        //     a = b;
        //     b =nextFibNum;
        // }
        int i=1;
        while(i <=n-2){
            int nextFibNum = a+b;
            System.out.println(nextFibNum);
            a = b;
            b = nextFibNum;
            i++;
        }
    }
}
