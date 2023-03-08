import java.util.Scanner;

public class AllXEndToString {
    // !first way to do this
    // static void allXEndToString(String str,int index,int count){
    //     if(index == str.length()){
    //         while(count != 0){
    //             System.out.print('x');
    //             count--;
    //         }
    //         return;
    //     }
    //     if(str.charAt(index) == 'x'){
    //         count++;
    //     }else{
    //         System.out.print(str.charAt(index));
    //     }
    //     allXEndToString(str, ++index, count);
    // }


    // !second way to do this
    static void allXEndToString(String str,int index,int count,String newstr){
        if(index == str.length()){
            while(count != 0){
                newstr += 'x';
                count--;
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(index) == 'x'){
            count++;
        }else{
            newstr += str.charAt(index);
        }
        allXEndToString(str, ++index, count,newstr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.next();
        allXEndToString(str, 0, 0,"");
    }
}
