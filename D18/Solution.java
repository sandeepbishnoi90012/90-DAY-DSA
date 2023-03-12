public class Solution {
    public static int maximumWealth(int[][] accounts) {
        int[] res = new int[accounts.length];
        for(int i =0;i<accounts.length;i++){
            int Sum =0;
            for(int j =0 ; j< accounts[i].length;j++){
                Sum += accounts[i][j];
            }
            res[i] = Sum;
        }
        int max = res[0];
        for(int i =0;i < res.length;i++){
            if(res[i] > max){
                max = res[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][]  arr = {{1,2,3},{3,2,1,4}};
        int res = maximumWealth(arr);
        System.out.println(res);
    }

}