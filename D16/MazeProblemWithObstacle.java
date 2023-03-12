import java.util.*;

public class MazeProblemWithObstacle {
    public static int countPoss(int i,int j,int n,int[] obs){
        if(i == n-1 || j == n-1){
            return 1;
        }
        if(obs[0] == i && obs[0] == j){
            return 0;
        }
        int left = countPoss(i+1,j,n,obs);
        int right = countPoss(i,j+1,n,obs);
        return left + right;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int obs[] = new int[2];
        n = sc.nextInt();
        System.out.println("enter the obs");
        obs[0] = sc.nextInt();
        obs[1] = sc.nextInt();

        sc.close();
        int res = countPoss(0,0,n,obs);
        System.out.println(res);
    }
}
