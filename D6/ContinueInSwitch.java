import java.util.Scanner;

public class ContinueInSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("this is 1");
            break;
            case 2: System.out.println("this is 1");
            // continue;
            case 4: System.out.println("this is 1");
            break;
        }
        
    }
}
