package D6;

import java.util.Scanner;

public class ComplemetRewise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numInBinary = 0;
        int ComplemetBinaryNum = 0;
        for (int i = 0; num != 0; i++, num = num >> 1) {
            int bit = num & 1;
            int ComplemetBit = bit == 1 ? 0 : 1;
            // System.out.print(bit);
            // System.out.print(ComplemetBit);
            if (bit == 1) {
                numInBinary += Math.pow(10, i);
            }
            if (ComplemetBit == 1) {
                ComplemetBinaryNum += Math.pow(10, i);
            }
        }
        System.out.println(numInBinary);
        System.out.println(ComplemetBinaryNum);
        int finalResult = 0;
        for (int i = 0; ComplemetBinaryNum != 0; i++, ComplemetBinaryNum /= 10) {
            int bit = ComplemetBinaryNum & 1;
            if (bit == 1) {
                finalResult += Math.pow(2, i);
            }
        }
        System.out.println(finalResult);

    }
}