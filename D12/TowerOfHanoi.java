import java.util.Scanner;

public class TowerOfHanoi {
 static void towerOfHanoi(int n,String source,String helper,String destination){
    if(n==1){
        System.out.println("disk 1 transfered " + source + " to " +destination);
        return;
    }
    towerOfHanoi(n-1, source, destination, helper);
    System.out.println("disk " + n +" is transferd " + source +  " to "+destination);
    towerOfHanoi(n-1, helper, source, destination);
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        towerOfHanoi(num, "S", "H", "D");
        sc.close();

    }
}