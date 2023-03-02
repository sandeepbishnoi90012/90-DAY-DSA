import java.util.Scanner;

public class ArmstrongNumber {
    static boolean checkArmstrong(int num){
        int sum = 0;
        int numCopy = num;
        while(num!=0){
            int temp = num %10;
            sum += Math.pow(temp, 3);
            num  /= 10;
        }
        if(sum == numCopy){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num  = sc.nextInt();
    boolean res =checkArmstrong(num);
    System.out.println(res);
    }
}
