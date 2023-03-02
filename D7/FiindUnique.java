public class FiindUnique {
    static void FindUnique(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        //in this array only one value is unique 
        int arr[] = {1,3,2,2,1,3,4,5,6,4,6,5,11};
        FindUnique(arr);
    }
}
