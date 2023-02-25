package D4;

public class allsortrewise {

    public static void bubbleSort(int arr[]) {
        for(int i =0;i < arr.length -1;i++){
            for(int j =0 ; j < arr.length - i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }


    public static void selectionSort(int arr[]) {
        for(int i =0;i < arr.length -1;i++){
            int min = arr[i];
            for(int j =i ; j < arr.length-1;j++){
                if(arr[j] < min){
                    int temp = arr[j];
                    arr[j] = min;
                    min= temp;
                }
            }
            arr[i] = min;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }

    public static void insertionSort(int arr[]) {
        for(int i =1;i < arr.length -1;i++){
            int base = arr[i];
            int j = i -1;
            for(; j >=0 && arr[j] >base ;j--){
               arr[j+1] = arr[j];
            }
            arr[j+1] = base;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,45,6,3,4,67,56,34,79,57,45,65};
        insertionSort(arr);
    }

}
