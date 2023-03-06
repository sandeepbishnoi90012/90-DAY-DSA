import java.util.Scanner;

public class Patterns {
    // 1st pattern
    static void PrintPattern1(int i, int j) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            System.out.print("* ");
            PrintPattern1(i, ++j);
        }else{
            System.out.println();
            PrintPattern1(--i, 0);
        }
    }

    // static void PrintPattern2(int i, int j) {
    //     if (i == 0) {
    //         return;
    //     }
    //     if (j < i) {
    //         PrintPattern1(i, ++j);
    //         System.out.print("* ");
    //     }else{
    //         System.out.println();
    //         PrintPattern1(--i, 0);
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // PrintPattern2(num,0);
    }
}
