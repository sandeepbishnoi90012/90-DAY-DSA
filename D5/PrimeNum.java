package D5;

import java.util.Scanner;

public class PrimeNum {
    public static boolean checkPrime(int num) {
        for(int i =2;i<num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        // if(checkPrime(n)){
        //     System.out.println(n+" is a prome number");
        // }else{
        //     System.out.println(n+" is a not prome number");
        // }


        // for(int i =2;i<=n;i++){
        //     if(i == n){
        //         System.out.println("this is  a prime number");
        //         break;
        //     }
        //     if(n%i == 0){
        //         System.out.println("this is not a prime number");
        //         break;
        //     }
        // }

        int sum = 0;
        int product = 1;
        for(int i =0;n>0;i++){
            sum += n%10;
            product *= n%10;
            n /= 10; 
        }
        int res = product- sum; 
        System.out.println(res);
    }
}
