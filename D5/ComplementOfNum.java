import java.util.Scanner;

public class ComplementOfNum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int binaryNum = 0;
        int ComplementInbinary = 0;
        for(int i =0;num != 0;i++,num = num >> 1){
            int bit = num & 1;
            int ComplementBit = bit==1?0:1;
            // System.out.print(bit);
            // System.out.print(ComplementBit);
            // System.out.println();
            if(bit !=0 ){
                binaryNum += Math.pow(10, i)*bit ;
            }
            if(ComplementBit != 0){
                ComplementInbinary += Math.pow(10, i)*ComplementBit;
            }
        }
        System.out.println(binaryNum);
        System.out.println(ComplementInbinary);
        
        // !conterting complement number to binary
        int result = 0;
        for(int i =0;ComplementInbinary !=0;i++,ComplementInbinary /= 10){
            int bit = ComplementInbinary &1;
            if(bit ==1){
                result += Math.pow(2, i);
            }
        }
        System.out.println(result);
    }
}
