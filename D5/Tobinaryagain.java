package D5;

import java.util.Scanner;

public class Tobinaryagain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //!there are many ways to convert a decimal num to a binary num
        //1st ways
        // String binaryString = Integer.toBinaryString(num);
        // int binaryNum = Integer.parseInt(binaryString);
        // System.out.println(binaryNum);

        // 2nd way 
        int binaryNum =0 ;
    for(int i =0;num != 0;i++,num = num >> 1){
        int bit  = num & 1;
        binaryNum += Math.pow(10, i)*bit;
    }
    System.out.println(binaryNum);
    }
}