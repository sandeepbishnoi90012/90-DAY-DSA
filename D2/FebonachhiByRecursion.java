package D2;

import java.util.Scanner;

public class FebonachhiByRecursion {
    public static void PrintFebonachhi(int a, int b, int c) {
        if (c == 0) {
            return;
        }
        System.out.println(a + b);
        PrintFebonachhi(b, a + b, c - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total febbonachhi number");
        int num = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        PrintFebonachhi(0, 1, num - 2);

    }
}