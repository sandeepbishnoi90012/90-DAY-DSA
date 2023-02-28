package D6;

public class sysExit {
    public static void main(String[] args) {
        int arr[]  = {1,2,3,4,5,7,67,8};
        for(int i  =0 ;i < arr.length;i++){
            if(arr[i] > 40){
                // System.out.println("exit");
                System.exit(0);
            }
            else{
                System.out.println(arr[i]);
            }
        }
    }
}
