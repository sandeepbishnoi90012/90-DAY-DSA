public class isPalindrome {
    public static int[] plusOne(int[] digits) {
        int[] res = digits.clone();
        int len = res.length;
        if(res[len-1] != 9){
            res[len-1]  +=1; 
        }


        
        return digits;
    }
        public static void main(String[] args) {
            int[] arr1 ={1,2,1};
            int[] arr = plusOne(arr1);
            System.out.println(arr);
        }
    }

