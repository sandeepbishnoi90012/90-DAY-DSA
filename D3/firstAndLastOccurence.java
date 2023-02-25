public class firstAndLastOccurence {

    // !this is from linear search where time complexity is O(n)
    // public static int[] findOccurence(int arr[],int num) {
    // int first = 0;
    // int last = 0;
    // for(int i = 0;i< arr.length;i++){
    // if(arr[i] == num){
    // if(first ==0){
    // first =i;
    // }else{
    // last =i;
    // }
    // }
    // }
    // int array[] = {first,last};
    // return array;
    // }

    // !this is from binary search where time complexity is O(log(n))
    public static int[] findOccurence(int arr[], int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (end - start)/2;
        int first = -1;
        int last = -1;
        
        
        while (start <= end) {
            if (arr[mid] == num) {
                for(int i = mid; arr[i] == num;i++){
                    last = i;
                }
                for(int i = mid; arr[i] == num;i--){
                    first = i;
                }
                int[] array = {first,last};
                return array ; 
            }
            if(num > arr[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            mid = (end - start)/2;
        }
        int[] array = {first,last};
        return array;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 2, 3, 4, 5, 5, 5, 5, 5, 6, 7 };

        // int res[] = findOccurence(arr, 5);
        // System.out.println("first occurence of this number is ==> "+ res[0]);
        // System.out.println("last occurence of this number is ==> "+ res[1]);
        
        int res[] = findOccurence(arr, 5);
        System.out.println("first occruence is ==>" + res[0]);
        System.out.println("last occruence is ==>" + res[1]);
    }
}