

public class SelectionSortByRecursion {
      // !print arrray function
      static void printArray(int[] arr){
        for(int i =0 ;i <arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }

    static void SelectionSortBy_Recursion(int[] arr,int iteration){
        if(iteration == arr.length-1){
            return;
        }
        int min = arr[iteration];
        for(int i = iteration; i < arr.length;i++){
            if(arr[i] < min){
                int temp = min;
                min = arr[i];
                arr[i] = temp;
            }
        }
        arr[iteration] = min;
        SelectionSortBy_Recursion(arr, iteration+1);
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        SelectionSortBy_Recursion(arr, 0);
        printArray(arr);
    }
}
