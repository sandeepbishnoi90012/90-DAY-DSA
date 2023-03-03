package D10;

public class elementInArray {
    //!linear search
    // static int elementIn_Array(int[] arr,int num,int index) {
    //     if(index == arr.length){
    //         return -1;
    //     }
    //     if(arr[index] == num){
    //         return index;
    //     }
    //     else{
    //         return elementIn_Array(arr, num, index+1);
    //     }
    // }
    //!binary search
    static int elementIn_Array(int[] arr,int num,int start,int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid] == num){
            return mid;
        }
        if(arr[mid] > num){
            end = mid-1;
            return elementIn_Array(arr, num, start, end);
        }else{
            start = mid +1;
            return elementIn_Array(arr, num, start, end);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,10,17,20,21,25};
        int res = elementIn_Array(arr, 3, 0,arr.length-1);
        System.out.println("index is ==> " + res);
        }
}
