import java.util.Scanner;

public class RemoveDuplicateSubsequences {
    static void removeDuplicateSubsequences(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        if(index == 0){
            // to be
            removeDuplicateSubsequences(str, index+1, newstr+currchar);
            // not to be
            removeDuplicateSubsequences(str, index+1, newstr);  
        }


        // to be
        if(index != 0 && str.charAt(index) != str.charAt(index-1)){
            // to be
            removeDuplicateSubsequences(str, index+1, newstr+currchar);
            // not to be
            removeDuplicateSubsequences(str, index+1, newstr);
        }
        if(index != 0 && str.charAt(index) == str.charAt(index-1)){
            // to be
            removeDuplicateSubsequences(str, index+2, newstr);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeDuplicateSubsequences(str, 0, "");
    }
}
