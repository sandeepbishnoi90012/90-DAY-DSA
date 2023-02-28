import java.util.Scanner;

public class PowerOfNum {
    public static int PowerFun(int a,int b ) {
        int ans = 1;
        for(int i =1 ;i <=b;i++){
            ans *= a;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int res = PowerFun(a,b);
        System.out.println(res);
    }
}
