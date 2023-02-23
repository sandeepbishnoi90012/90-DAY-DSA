public class findOccurence {
    public static int first = -1;
    public static int last = -1;

    public static void find_occurence(String str, int index, char element) {

        if (index == str.length()) {
            System.out.println("thishd");
            System.out.println("first occurence is ==>" + first);
            System.out.println("last occurence is ==>" + last);
            return;
        }
        char currchar = str.charAt(index);
        if (currchar == element) {
            if(first == (-1)) {
                first = index;
            }else {
                last = index;
            }
            find_occurence(str,index+1, element);
        }
    }

    public static void main(String[] args) {
        String str = "sandeep";
        find_occurence(str, 0, 's');
    }
}
