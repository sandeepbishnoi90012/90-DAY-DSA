public class ElementInArrayBinary{
    static boolean ElementInArray_Binary(int[] arr,int s,int e,int key){
        //base cases
        if(s > e){
            return false;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == key){
            return true;
        }
        if(arr[mid] > key){
            return ElementInArray_Binary(arr, s, mid-1, key);
        }else{
            return ElementInArray_Binary(arr, mid+1, e, key);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,18,21,45,89};
        int key = 21;
        boolean res = ElementInArray_Binary(arr, 0, arr.length-1, key);
        System.out.println(res);
    }
}