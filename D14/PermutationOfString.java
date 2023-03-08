import java.util.Scanner;

public class  PermutationOfString{
    public static void printPermutationOfString(String str,String permuString) {
        if(str.length() == 0){
            System.out.println(permuString);
            return;
        }
        for(int i =0; i < str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutationOfString(newStr, permuString+currChar);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutationOfString(str,"");
    }
}