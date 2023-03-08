import java.util.Scanner;

public class KeypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printcomb(String str,int idx,String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currchar = str.charAt(idx);
        System.out.println(currchar);
        String substr = keypad[currchar - '0'];
        for(int i=0; i<substr.length();i++){
            printcomb(substr, idx+1, combination+substr.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        printcomb(str, 0, "");

    }
}