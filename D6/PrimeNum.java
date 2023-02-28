import java.util.Scanner;

public class PrimeNum {
    public static boolean CheckPrime(int num) {
        for(int i=2;i<num;i++){
            if(num %i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = CheckPrime(num);
        System.out.println(res);
    }
}
