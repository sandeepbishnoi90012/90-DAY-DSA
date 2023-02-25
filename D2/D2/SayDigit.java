package D2;

import java.util.Scanner;

public class SayDigit {
    public static void Saydigit(int num) {
        if (num == 0) {
            return;
        }

        Saydigit(num/10);
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

        int temp = num % 10;
        System.out.print(arr[temp] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        Saydigit(num);
        sc.close();

    }
}
