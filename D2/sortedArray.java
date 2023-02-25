

public class sortedArray {
    public static boolean sorted_array(int[] arr,int index) {
        if(index == arr.length -1){
            return true;
        }
        if(arr[index]  >= arr[index + 1]){
            return false;
        }
        else{
            return sorted_array(arr, index+1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        if(sorted_array(arr,0)){
            System.out.println("your array is sorted");
        }else{
            System.out.println("your array is not sorted");
        }
    }
}
