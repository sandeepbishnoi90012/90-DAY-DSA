import java.util.ArrayList;

class Solution {
    public static int[] separateDigits(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i< nums.length;i++){
            if(nums[i] < 10){
                res.add(nums[i]);
            }else{
                String temp = Integer.toString(nums[i]);
                for(int j =0;j < temp.length();j++){
                    char currchar = temp.charAt(j);
                    int currint = currchar  -'0';
                    res.add(currint);
                }
            }
        }
        int[] resArray = new int[res.size()];
        for(int i =0; i< resArray.length;i++){
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 121, 1123, 9 };
          int res[] =  separateDigits(nums);
          for(int i =0 ;i < res.length;i++){
            System.out.print(res[i] + " ");
          }
    }
}