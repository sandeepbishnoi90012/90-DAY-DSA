import java.util.Scanner;

public class Subsequences {
    static void subsequencesOfstring(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(index);
        // to be 
        subsequencesOfstring(str,index+1, newstr+currchar);
        // not to be
        subsequencesOfstring(str, index+1, newstr);
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        subsequencesOfstring(str, 0, "");
    }
}
