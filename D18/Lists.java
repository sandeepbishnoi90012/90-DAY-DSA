import java.util.*;;

public class Lists {
    public static void main(String[] args) {
    //creating a list and array
    // int[] arr = {1,2,3,4};

    // List<Integer> lis = new ArrayList<>();
    // for(int i =0;i < arr.length;i++){
    //     lis.add(arr[i]);
    // }
    // System.out.println(lis);


    // List<String> names = new ArrayList<>();
    Scanner sc  = new Scanner(System.in);
    // for(int i =0 ;i < 5;i++){
    //     names.add(sc.next());
    // }
    // System.out.println(names);
    // names.set(4, "meri marji ka item");
    // System.out.println(names);


    List<Boolean> sd = new ArrayList<>();
    for(int i =0;i < 3;i++){
        sd.add(sc.nextBoolean());
    }
    System.out.println(sd);
    }
}
