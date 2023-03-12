public class Solution2 {
    // public static int[] shuffle(int[] nums, int n) {
    //     int[] res1 = new int[nums.length/2];
    //     int[] res2 = new int[nums.length/2];
    //     int[] res = new int[nums.length];
    //     for(int i =0;i < res1.length;i++){
    //         res1[i] = nums[i];
    //         res2[i] = nums[res1.length + i];
    //         res[(2 * i)] = res1[i];
    //             res[(2 * i)+1] = res2[i];
    //     }
    //     return res;
    // }
    
    public static int[] shuffle(int[] nums, int n) {
      int mid = nums.length/2;
        int[] res = new int[nums.length];
        for(int i =0;i < mid;i++){
            res[(2 * i)] = nums[i];
                res[(2 * i)+1] = nums[mid+i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] res = shuffle(arr, 3);
        for(int i  =0 ;i < arr.length;i++){
            System.out.print( res[i] +" ");
        }
    }
}
