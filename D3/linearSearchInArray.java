import java.util.Scanner;

public class linearSearchInArray{
    public static void checkNum(int arr[],int num,int index) {
        if(index == arr.length){
            System.out.println("your element is not in array");
            return;
        }
        if(num == arr[index]){
            System.out.println("your element is in array");
            return;
        }
        else{
            checkNum(arr, num, index+1);
        }
        
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkNum(arr, num, 0);
        sc.close();
    }
}