public class Sorting {
    // bubble sort
    static void bubbleSort(int[] arr){
        for(int i =0;i < arr.length -1;i++){
            for(int j = 0; j <arr.length -i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        for(int i = 0 ;i <arr.length;i++){
            System.out.print(arr[i] + " ");       
        }
    }
    // insertion sort
    static void InsertionSort(int[] arr){
        for(int i =1;i < arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            for(; j >= 0 && arr[j] > temp;j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
            System.out.println(arr[j+1]);
        }
        for(int i = 0 ;i <arr.length;i++){
            System.out.print(arr[i] + " ");       
        }
    }
    // bubble sort
    static void selectionSort(int[] arr){
        for(int i =0;i < arr.length -1;i++){
            int min = arr[i];
            for(int j = i; j <arr.length;j++){
                if(arr[j] < min){
                   int temp = arr[j];
                   arr[j] = min;
                   min = temp;
                }
                arr[i] = min;
            }
        }
        for(int i = 0 ;i <arr.length;i++){
            System.out.print(arr[i] + " ");       
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {7,8,3,1,2};
        int[] arr2 = {27,28,23,21,22};
        int[] arr3 = {17,18,13,11,12};
        selectionSort(arr3);
    }
}
