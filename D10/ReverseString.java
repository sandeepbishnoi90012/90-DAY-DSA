


// package D10;

// import java.util.Scanner;
// // ! this is form method in loop
// public class ReverseString {
// //     static String revString(String str){
// //         String rev_String = "";
    
// //         for (int i = str.length() - 1; i >= 0; i--) {
// //             rev_String = rev_String +  str.charAt(i);
// //         }
// //         System.out.println(rev_String);
// //         return rev_String;
// //     }

//     // !this is from recursion
//     static String rev_String(String str,int index){
//         if(index == str.length()-1){
//             String revString = "";
//             revString += str.charAt(index);
//             return revString;
//         }
//         String revString ="";
//         revString += rev_String(str, index+1) + str.charAt(index);
//         return revString;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();  
//         String res = rev_String(name,0);
//         System.out.println(res);
// }
// }



