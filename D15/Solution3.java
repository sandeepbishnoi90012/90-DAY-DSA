    public class Solution3 {
        public static int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            for(int i =0; i < nums.length;i++){
                for(int j =0;j < nums.length;j++){
                    if(i == j){
                        continue;
                    }
                    if((nums[i] + nums[j])==target){
                        res[0] = i;
                        res[1] = j;
                    }
                }
            }
            return res;
        }
        public static void main(String[] args) {
            int[] arr = {3,2,3};
            int target = 6;
            int[] res = twoSum(arr, target);
            System.out.println(res[0]);
            System.out.println(res[1]);
        }
    }

