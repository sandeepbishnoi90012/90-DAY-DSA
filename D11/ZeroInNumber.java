public class ZeroInNumber {

    // !this is from iteration 
    // static int ZeroIn_Number(int num){
    //     int count = 0;
    //     while(num != 0){
    //         if(num%10 == 0){
    //             count++;
    //         }
    //         num = num/10;
    //     }
    //     return count;
    // }


    // !this is from recurtion 
    static int ZeroIn_Number(int num){
        if(num < 10){
            return 0;
        }
        int count = 0;
        if(num%10 == 0){
            count++;
        }
        count += ZeroIn_Number(num/10);
        return count;
    }
    public static void main(String[] args) {
        int num = 303;
        int res = ZeroIn_Number(num);
        System.out.println(res);
    }
}
