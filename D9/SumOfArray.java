import java.util.Scanner;

public class SumOfArray {
    static int sum(int[] arr,int length,int index){
        if(length == -1){
            return 0;
        }
        if(length == 0){
            return arr[index];
        }
        if(length == index){
            return arr[index];
        }
        int res = arr[index];
        res += sum(arr, length, index+1);
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int res = sum(arr, arr.length -1, 0);
        System.out.println(res);
    }
}
