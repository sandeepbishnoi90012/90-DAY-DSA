import java.util.Scanner;

public class StringRev {
    static void stringRev(String str,int index){
        if(index < 0){
            return;
        }
        System.out.print(str.charAt(index));
        stringRev(str,--index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        stringRev(str, str.length()-1);
    }
}
