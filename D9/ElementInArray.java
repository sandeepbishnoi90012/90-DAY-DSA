import java.util.Scanner;

public class ElementInArray {
    static boolean Element_InArray(int[] arr,int num,int index){
        if(index == arr.length){
            return false;
        }

        if(num == arr[index]){
            return true;
        }else{
            return Element_InArray(arr, num, index+1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,2,45,67,34};
        boolean res = Element_InArray(arr, 1000, 0);
        System.out.println(res);
    }
}
