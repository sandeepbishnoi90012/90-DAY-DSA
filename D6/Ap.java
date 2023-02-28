import java.util.Scanner;

public class Ap {
    public static int findAp(int n) {
        return (3*n +7);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int res = findAp(n);
        System.out.println(res);
    }
}
