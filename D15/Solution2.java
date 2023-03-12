import java.util.Scanner;

public class Solution2 {
    public static int distinctIntegers(int n,int i) {
        if(i == n){
            return 0;
        }
        int res  =0 ;
        if((n % i) ==1){
            res++;
            res += distinctIntegers(i, 2);
        }
        res += distinctIntegers(n, i+1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = distinctIntegers(n, 2) ;
        res++;
        System.out.println(res);
    }
}
