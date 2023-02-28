import java.util.Scanner;

public class TotalSetBit {
    public static int Total_Set_Bit(int a, int b) {
        int count = 0;
        while(a!=0){
            if((a&1) == 1){
                count++;
            }
            a = a>>1;
        }
        while(b!=0){
            if((b&1) == 1){
                count++;
            }
            b = b>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Total_Set_Bit(a, b);
        System.out.println(res);
    }
}
