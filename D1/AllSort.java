public class AllSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 7, 8, 3, 1, 2 };
        int arr2[] = { 7, 8, 3, 1, 2 };
        int arr3[] = { 7, 8, 3, 1, 2 };

        // bubble sort
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println("from bubble sort");
        printArray(arr1);
        System.err.println();

        // selection sort
        for (int i = 0; i < arr2.length - 1; i++) {
            int minValue = arr2[i];
            for (int j = i + 1; j < arr2.length - 1; j++) {
                if (minValue > arr2[j]) {
                    int temp = minValue;
                    minValue = arr2[j];
                    arr2[j] = temp;
                }
            }
            arr2[i] = minValue;
        }
        System.out.println("from selection sort");
        printArray(arr1);
        System.out.println();


        // insertion sort
        for (int i = 1; i < arr3.length ; i++) {
            int current = arr3[i];
            int j = i-1;
            for (; j <=0 && arr3[j] > current; j--) {
                arr3[j+1] = arr3[j];
            }
            arr3[j+1] = current;
        }
        System.out.println("from insertion sort");
        printArray(arr1);

    }
}

// these are the basic sorting algo
