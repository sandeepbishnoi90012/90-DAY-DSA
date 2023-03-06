import java.util.ArrayList;
import java.util.Scanner;

public class changesInString {
    // !this is 1st way
    // static StringBuilder strcha(StringBuilder str, int i) {
    //     if (i == str.length()) {
    //         return str;
    //     }
    //     if (str.charAt(i) == 'a') {
    //         str.deleteCharAt(i);
    //     }
    //     return strcha(str, ++i);
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        // for(int i = 0;i<str.length();i++){
        // if(str.charAt(i) == 'a'){
        // str.deleteCharAt(i);
        // }
        // }
        // System.out.println(str);
        // }
    }
}
