import javax.security.auth.login.CredentialException;

public class Solution6 {
    public static int[] createTargetArray(int[] nums, int[] index) {    
    int[] res = new int[index.length];
    for(int i =index.length-1;i > -1;i--){
        res[index[i]] = nums[i];
    }
    return res;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] res = createTargetArray(nums, index);
        for(int i  =0 ;i < res.length;i++){
            System.out.print( res[i] +" ");
        }
    }
}
