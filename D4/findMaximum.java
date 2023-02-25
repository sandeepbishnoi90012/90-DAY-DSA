package D4;

public class findMaximum {
    //! this is from linear search

    // public static int findMax(int arr[]) {
    // int len = arr.length;
    // int MAX = 0;
    // for(int i=0 ;i <len;i++){
    // if(arr[i] > MAX)
    // MAX = arr[i];
    // }
    // return MAX;
    // }

    // //! this is from bianry search

    public static int findMax(int arr[]) {
    int start = 0;
    int end = arr.length -1;
    System.out.println(end);
    int mid = (start + end)/2;
    while(start < end){
        if(arr[mid] < arr[mid+1]){
            start  = mid+1;
        }else{
            end = mid;
        } 
        mid = (start + end)/2;
    }
    return arr[start];
    }
    public static void main(String[] args) {
        // int arr[] ={1,2,3000,4,23,4,532,4,54,65,60};
        int arr[] = { 12, 13, 17, 25, 28, 45, 89, 90, 113, 67, 45, 34, 12, 10, 7, 3 };
        int res = findMax(arr);
        System.out.println(res);
    }
}
