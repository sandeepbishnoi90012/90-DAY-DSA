public class reverseString {
    // public static void reversestring(String name,int index) {
    //     if(index < 0){
    //         return;
    //     }
    //     System.out.print(name.charAt(index));
    //     reversestring(name, index-1);
    // }
    public static void main(String[] args) {
        String name = "sandeep";
        // reversestring(name,name.length()-1);

        //reverse string by loop
        for(int i =0,j=name.length();i<j;i++,j--){
            name.charAt(i);
        }

    }
}
