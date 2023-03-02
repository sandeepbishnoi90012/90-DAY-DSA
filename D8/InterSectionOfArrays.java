public class InterSectionOfArrays {
    static int[] findInterSectionOfArrays(int[] arr1,int[] arr2){
        int[] res = new int[6];
        int count = 0;
        for(int i= 0;i< arr1.length;i++){
            for(int j =0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    res[count] = arr1[i];
                    count++;
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6}; 
        int[] arr2 = {1,2,3,4,9,0}; 
        int[] res = findInterSectionOfArrays(arr1, arr2);
        for(int i =0;i < res.length;i++){
            System.out.print(res[i] +" ");
        }
        
    }
}
