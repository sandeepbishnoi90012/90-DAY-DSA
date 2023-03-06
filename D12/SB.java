public class SB {
    public static void main(String[] args) {
        StringBuilder aTOz = new StringBuilder();
        for(int i =0 ; i < 26;i++){
            char ch = (char)('a' +i);
            System.out.print(ch + " ");
            aTOz.append(ch);
        }
        System.out.println(aTOz);
    }
}
