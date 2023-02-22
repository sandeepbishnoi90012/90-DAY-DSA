public class SelectionSort {
    public static void printArray(int arr[]) {
        for(int i =0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
   
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,90,23};
        for(int i =0 ; i < arr.length -1;i++){
            int min = arr[i];
            for(int j = i+1; j < arr.length;j++){
                if(min > arr[j]){
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
        printArray(arr);
    }
}
