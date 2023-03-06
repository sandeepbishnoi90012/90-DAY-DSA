public class StringMethods{
    public static void main(String[] args) {
        // String name1 = "sandeep";
        // String name2 = "sandeep";

        String name1 = new String("sandeep");
        String name2 = new String("sandeep");

        if(name1 == name2){
            System.out.println("both are equal");
        }
        System.out.println(name1.equals(name2));

    }
}