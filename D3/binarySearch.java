public class binarySearch{
    //this function perform a binary search in array
    public static int checkIndex(int arr[] , int num){
        int start = 0;
        int end = arr.length -1;
        int mid = (start + end)/2;
        while(start <= end){
            if(arr[mid] == num){
                return mid;
            }
            if(num > arr[mid]){
                start = mid +1; 
            }else{
                end = mid -1;
            }
            mid = (start+ end)  / 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,8,12,14,67,89,100};
        int res = checkIndex(arr, 672);
        System.out.println("the index is "+ res);
    }
}