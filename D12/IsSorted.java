public class IsSorted {
    static boolean IsSorted(int arr[], int i) {
        if(arr.length == 0 || arr.length == 1){
            return true;
        }
        if(i == arr.length-2){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }else{
            return IsSorted(arr, ++i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 7, 3, 4, 5 };
        boolean res = IsSorted(arr, 0);
        System.out.println(res);
    }
}