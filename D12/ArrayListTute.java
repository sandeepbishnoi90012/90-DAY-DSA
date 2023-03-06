import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTute {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5};
        // ArrayList<Integer> mylist = new ArrayList<>(3);
        // // this is an arraylist
        // mylist.add(120);
        // mylist.add(50);
        // mylist.add(10);
        // mylist.add(2);
        // // mylist[0] = 10; this is wrong way to do this
        // mylist.set(0, 10);
        // // this is one way
        // // System.out.println(mylist);
        // // this is another way
        // for(int i =0;i < 4;i++){
        // System.out.println(mylist.get(i));
        // }

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            myList.add(sc.nextInt());
        }
        System.out.println(myList);
        for (int i = 0; i < 5; i++) {
            myList.set(0, sc.nextInt());
        }
        System.out.println(myList);
        myList.remove(0);
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);

    }

}
