import java.util.Scanner;

public class findDuplicate {
    static int find_Duplicate(int[] arr){
        int res = 0;
        for(int i=0;i< arr.length;i++){
            res = res^arr[i];
        }
        for(int i= 1;i<arr.length;i++){
            res = res^i;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the element of an array");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int res =  find_Duplicate(arr);
        System.out.println("Your result is ==> "+res);

    }
}
