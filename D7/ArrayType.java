import java.util.Scanner;
import java.util.*;

public class ArrayType {
    public static void main(String[] args) {
        // int[] arr;
        // arr = new int[5];
        // // System.out.println(arr[0]);
        // String name[] = new String[4];
        // System.out.println(name[3]);

        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[5];
        // for(int i =0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i =0;i<arr.length;i++){
        //     System.out.println( arr[i] + " ");
        // }
        // String arrayString = Arrays.toString(arr);
        // System.out.println(arrayString);

        String names[] = new String[4];
        for(int i =0;i< names.length;i++){
            names[i] = sc.nextLine();
        }
        // for(int i =0;i< names.length;i++){
        //     System.out.print(names[i] +" ");
        // }
        String allName = Arrays.toString(names);
        System.out.println(allName);
        
    }
}
