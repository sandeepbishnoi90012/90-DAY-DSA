public class Solution7 {
    // public static boolean checkIfPangram(String sentence ,int charaski) {
    //     if(charaski == 123){
    //         return true;
    //     }
    //     char ch = (char) charaski;
    //     // System.out.println();
    //     for(int i =0;i<sentence.length();i++){
    //         if(ch == sentence.charAt(i)){
    //             return checkIfPangram(sentence, charaski+1);
    //         }
    //     }
    //     return false;
    // }

    public static boolean checkIfPangram(String sentence) {
        boolean res = true;
       for(int j = 97;j< 123;j++){
        for(int i =0; i<= sentence.length();i++){
            if(i == sentence.length()){
                res = false;
                continue;
            }
            char ch1 = (char)j;
            char ch2 = sentence.charAt(i);
            if(ch1 == ch2){
                break;
            }
           }
           if(!res){
            continue;
           }
       }
       return res;
    }
    public static void main(String[] args) {
        String str = "thequijumpsoverthelazydog";
        boolean res = checkIfPangram(str);
        System.out.println(res); 
    }
}
