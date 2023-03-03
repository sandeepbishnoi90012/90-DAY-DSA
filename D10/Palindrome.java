package D10;

import java.util.Scanner;

public class Palindrome {
    //! this is from loop
    // static boolean  palindrome(String str){
    //     boolean ispalindrome = true;
    //     for(int i =0, j = str.length() -1;i < j;i++,j--){
    //         if(str.charAt(i) != str.charAt(j)){
    //             ispalindrome = false;
    //         }
    //     }
    //     return ispalindrome;
    // }

    //! this is from recurion
    static boolean  palindrome(String str,int i,int j){
       if(i > j){
        return true;
       }
       if(str.charAt(i) == str.charAt(j)){
        // System.out.println("out");
        return palindrome(str, i+1, j-1);
       }else{
        return false;
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
