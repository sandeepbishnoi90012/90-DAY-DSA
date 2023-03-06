

public class BubbleSortUsingRecursion {
    // !print arrray function
    static void printArray(int[] arr){
        for(int i =0 ;i <arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }


     // !bubble sort using for loop
    // static int[] bubblesort(int[] arr){
    //     for(int i =0;i < arr.length-1;i++){
    //         for(int j =0;j < arr.length - i-1;j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }

    
        // !bubble sort using recursion loop ==> 1st
        // static void bubblesort(int[] arr,int index,int iteration){
        //     if(iteration == arr.length -2){
        //         return;
        //     }
        
        //     if(index == arr.length-iteration-1){
               
        //          bubblesort(arr, 0, iteration+1);
        //     }
        //     if(arr[index]  > arr[index+1]){
        //         int temp = arr[index];
        //         arr[index] = arr[index +1];
        //         arr[index+1] = temp;
        //     }
        //      bubblesort(arr, index+1,iteration);
        // }
    
        // !bubble sort using recursion loop ==> 2nd
        // static void bubblesort(int[] arr,int iteration){
        //     if(iteration == arr.length -2){
        //         return ;
        //     }
        
        //    for(int i =0 ;i < arr.length -iteration -2;i++){
        //     if(arr[i] > arr[i+1]){
        //         int temp = arr[i];
        //         arr[i] = arr[i+1];
        //         arr[i+1] = temp;
        //     }
        //     bubblesort(arr, iteration+1);
        //    }
        // }
    
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,5,5};
        // bubblesort(arr,0,0);
        printArray(arr);
    }
}
