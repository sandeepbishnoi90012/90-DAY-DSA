public class ArraySorte {
    static boolean isSorted(int[] arr,int index){
        if(index == arr.length -1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }else{
            return isSorted(arr, ++index);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        boolean res = isSorted(arr, 0);
        System.out.println(res);
    }
}
