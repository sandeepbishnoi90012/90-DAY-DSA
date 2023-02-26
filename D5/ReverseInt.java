package D5;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ReversedNum = 0;
        while(num != 0){
            int temp = num % 10;
            num /= 10;
            ReversedNum = (ReversedNum *10)+temp;
        }
        System.out.println("your reversed num is ==> " + ReversedNum);
    }
}
