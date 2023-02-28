package D6;

import java.util.Scanner;

public class PowerOfTow {
    public static boolean checkTwo(int num) {
        while(num != 1){
        if((num % 2 )!= 0 ){
            return false;
        }
        num = num /2;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean res  = checkTwo(num);
        System.out.println(res);
    }
}