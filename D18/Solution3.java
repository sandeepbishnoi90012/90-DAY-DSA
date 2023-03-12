import java.util.*;

public class Solution3 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for(int i =0; i< candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for(int i = 0; i< candies.length;i++){
            if((candies[i] +  extraCandies ) >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        List<Boolean> res = kidsWithCandies(arr, 3);
        System.out.println(res);
    }
}
