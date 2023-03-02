import java.util.Scanner;

public class UniqueInArray{
    static int findUnique(int[] arr){
        int res = 0;
        for(int i =0 ;i< arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 5 element");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int res = findUnique(arr);
        System.out.println(res);
    }
}