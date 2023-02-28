import java.util.Scanner;

public class fibbonachi {
    public static void printFibbo(int a,int b,int num) {
        if(num > 10){
            return;
        }
        int res = a+b;
        System.out.println(res);
        num++;
        printFibbo(b, res, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        printFibbo(0, 1, num);
    }
}
