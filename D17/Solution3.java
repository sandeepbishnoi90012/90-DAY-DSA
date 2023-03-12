public class Solution3 {
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length;i++){
            int sum = 0;
            for(int j =0 ; j <=i ; j++){
                sum += nums[i];
            }
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        int[] res  = runningSum(arr);
        for(int i = 0 ;i <  res.length;i++){
            System.out.print(res[i]);
        }
    }
}
