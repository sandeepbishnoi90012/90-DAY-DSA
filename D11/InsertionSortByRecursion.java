

public class InsertionSortByRecursion {

  // !print arrray function
  static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  // !Insertion sort using for loop
  // static void InsertionSortBy_Recursion(int[] arr){
  //     for(int i =1;i < arr.length;i++){
  //         int j = i-1;
  //         int min = arr[i];
  //         for(;j >= 0 && arr[j] > min;j--){
  //             arr[j+1] = arr[j];
  //         }
  //         arr[j+1] = min;
  //     }
  // }

  // !insertion sort using recurtion
  static void InsertionSortBy_Recursion(int[] arr, int iteration) {
    if(iteration == arr.length){
        return;
    }
    int j = iteration-1;
    int min = arr[iteration];
    for(; j >= 0 && arr[j] > min;j--){
        arr[j+1] = arr[j];
    }
    arr[j+1] = min;
    InsertionSortBy_Recursion( arr,iteration+1);
  }

  public static void main(String[] args) {
    int[] arr = { 7, 8, 3, 1, 2 };
    InsertionSortBy_Recursion(arr,1);
    printArray(arr);
  }
}
