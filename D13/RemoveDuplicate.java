import java.util.Scanner;

public class RemoveDuplicate {
    // !this is first way to do this
    // static void removeDuplicate(String str,int index,String newstr){
        //     if(index == str.length()){
    //         System.out.println(newstr);
    //         return;
    //     }
    //     String currchar = "";
    //     currchar += str.charAt(index);
    //     if(newstr.contains(currchar)){
    //         removeDuplicate(str, ++index, newstr);
    //     }else{
    //         newstr += currchar;
    //         removeDuplicate(str, ++index, newstr);
    //     }
    // }


    // !this is second way to do this
        static boolean[] map =  new boolean[26];
    static void removeDuplicate(String str,int index,String newstr){
        if(index == str.length()){
            System.out.println(newstr);
            return;
        }
       char currchar = str.charAt(index);
       if(map[currchar  - 'a']){
        removeDuplicate(str, ++index, newstr);
       }else{
        newstr += currchar;
        map[currchar -'a'] = true;
        removeDuplicate(str, ++index, newstr);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        sc.close();
        removeDuplicate(str, 0, "");
    }
}
