public class Solution2 {
    public static int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length *2];
        for(int i = 0; i < res.length ;i++){
            // System.out.println(i);
            if(i > (nums.length-1)){
                
                res[i] = nums[(i-nums.length)];
            }else{
            res[i] = nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
     int[] arr = {1,2,1};  
     int res[] = getConcatenation(arr);
     for(int i = 0;i<res.length;i++){
        System.out.println(res[i] + " ");
     }
    }
}
