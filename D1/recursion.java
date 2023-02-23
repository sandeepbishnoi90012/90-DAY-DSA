import java.util.Scanner;

public class recursion {

    // resurtion function
    // public static void printNum(int num) {
    //     if (num > 10) {
    //         return;
    //     }
    //     System.out.println(num);
    //     printNum(num + 1);
    // }



    // public static void printSum(int num ,int sum) {
    //     if (num == 0) {
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += num;
    //    printSum(num-1, sum);
    // }
    public static int printFactorial(int num) {
        if(num==1){
            return 1;
        }
        int Factorail = 1;
         Factorail = num * printFactorial(num-1);
        return Factorail;
    }


    public static void main(String[] args) {
        // int num1 = 10;

        // from iteration
        // for (int i = 0; i <= num1; i++) {
        //     System.out.println(i);
        // }


        // int num2 =1;
        // from recursion
        // printNum(num2);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // printSum(num, 0);;

        int ans =  printFactorial(num);
        System.out.println(ans);
    }
}
