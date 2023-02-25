public class firstAndLastOccurenceSaprate {

    public static int firstOccurence(int[] arr,int num,int n) {
        int start = 0;
        int end = n -1;
        int mid = (end - start)/2;
        int res = 0;
        while(start <= end){
            System.out.println(start);
            System.out.println(end);
            if(arr[mid]==num){
                res = mid;
                end = mid-1;
            }
            if(num > arr[mid]){
                start = mid + 1;
            }  else{
                end = mid -1;
            }
            mid = (end - start)/2;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3};
        int res = firstOccurence(arr, 4,4);
        System.out.println(res);
    }
}
