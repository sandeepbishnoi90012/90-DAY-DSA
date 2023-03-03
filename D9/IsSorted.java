

public class IsSorted {
    static boolean is_Sorted(int[] arr, int length, int num) {
        if (length-1 == (num)) {
            return true;
        }
        if (arr[num] > arr[num +1]) {
            return false;
        } else {
            return is_Sorted(arr, length, num + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        boolean res = is_Sorted(arr, arr.length, 0);
        System.out.println(res);
    }
}