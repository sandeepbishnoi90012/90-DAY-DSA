public class moveXtoEnd {
    
    public static void movextoEnd(String str,int index,char element){


        if(index == str.length()-1){
            System.out.println(str);
            return;
        }


        if(str.charAt(index) == element){
            System.out.println(index);
            str = str.substring(0 ,index)  +str.substring(index+1)+element;
            movextoEnd(str, index++, element);
        }else{
            movextoEnd(str, index++, element);
        }
    }
    public static void main(String[] args) {
        String name = "axbcxxd";
        movextoEnd(name,0,'x');
       
       
    }
}
