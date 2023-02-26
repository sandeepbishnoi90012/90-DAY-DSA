package D5;

public class ToDecimal {
    public static void main(String[] args) {
        int binaryNum = 10;
        int decimalNum = 0;
        for(int  i =0; binaryNum != 0;i++, binaryNum = binaryNum >> 1){
            int bit  = binaryNum & 1;
            decimalNum += Math.pow(2, i)*bit;
        }
        System.out.println(decimalNum);
    }
}
