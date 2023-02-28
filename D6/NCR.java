import java.util.Scanner;

public class NCR {
    public static int findNcr(int n , int r) {
        int nFact = 1;
        int rFact = 1;
        int temp = n-r;
        int tempFact = 1;
        for(int i =1; i<=n;i++){
            nFact *= i;
        }
        for(int i =1; i<=r;i++){
            rFact *= i;
        }
        for(int i =1; i<=temp;i++){
            tempFact *= i;
        }
      
        return (nFact /(rFact *tempFact));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the n");
        int n = sc.nextInt();
        System.out.println("please enter the r");
        int r = sc.nextInt();
        int res = findNcr(n, r);
        System.out.println(res);
    }
}
