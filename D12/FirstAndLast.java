import java.util.Scanner;

public class FirstAndLast {
    static void FirstAndLast(String str,int index,char ch,int first,int last){
        if(index == str.length() ){
            System.out.println("first ==>" + first); 
            System.out.println("first ==>" + last); 
            return;
        }
        if(str.charAt(index) == ch){
             last = index;
            if(first ==0){
                first = index;
            }
        }
        FirstAndLast(str, ++index, ch, first, last);
      
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        char ch = sc.next().charAt(0);
       FirstAndLast(str, 0, ch, 0, 0);
    }
}