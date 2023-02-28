import java.util.Scanner;

public class EvenOrOdd {

    public static boolean chechNum(int num) {
        if((num & 1)==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = chechNum(num);
        System.out.println(res);
    }
}
