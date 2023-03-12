class Solution {
    public static int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for(int i =0 ;i <res.length;i++){
            int idx = nums[i];
            res[i] = nums[idx];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] res = buildArray(arr);
       for(int i= 0; i < res.length;i++){
        System.out.print( res[i] +" ");
       }
    }
}