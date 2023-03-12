public class Solution5 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i =0; i< nums.length;i++){
            System.out.print(i);
            int sum =0;
            for(int j = 0;j < nums.length;j++){
                if(j ==i){
                    continue;
                }
                if(nums[i] > nums[j]){
                    sum++;
                }
            }
        System.out.print( " "+sum);
            res[i] = sum;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] res = smallerNumbersThanCurrent(arr);
        System.out.println();
        for(int i  =0 ;i < arr.length;i++){
            System.out.print( res[i] +" ");
        }
    }
}
