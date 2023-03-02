package D7;

public class MethodOverloading {
    //this is an example of method overloading
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        fun(2);
        fun("Sandeep");
    }
}