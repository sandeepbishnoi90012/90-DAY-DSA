import java.util.Scanner;

public class MazeProblem{
    public static int countPoss(int i,int j){
        if(i ==1 || j == 1){
            return 1;
        }
        
        int left = countPoss(i-1,j);
        int right = countPoss(i,j-1);
        // int dignoal = countPoss(i-1, j-1);
        return left + right ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        i = sc.nextInt();
        j = sc.nextInt();
        sc.close();
        int res = countPoss(i,j);
        System.out.println(res);
    }
}