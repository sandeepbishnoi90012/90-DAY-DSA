package D10;

public class Recursion {
    //! linear search
    // static int[] findFirstAndLastOccurence(int[] arr,int s,int e,int num,int index) {
    //     if(arr.length-1 == index){
    //         if(arr[index] == num){
    //             if(e == 0){
    //                 e = index;
    //             }
    //             s =index;
    //         }
    //         int array[] = {s,e};
    //         return array;
    //     }
    //     int[] res =  findFirstAndLastOccurence(arr, s, e, num, index+1);
    //     if(arr[index] == num){
    //         if(res[1] == 0){
    //             res[1] = index;
    //         }
    //         res[0] = index;
    //     }
    //     return res;
    // }

    // //! binary search + linear search
    // static int[] findFirstAndLastOccurence(int[] arr,int num,int first,int last,int s,int e){
    //     if(s > e){
    //         int array[] = {-1,-1};
    //         return array;
    //     }

    //     int mid = s + (e-s)/2;
    //     if(arr[mid] == num){
    //         for(int i = mid;arr[i] == num && i > 0;i--){
    //             // System.out.println(i);
    //             first = i; 
    //         }
    //         int len = arr.length;
    //         for(int i = mid; i < len && arr[i] == num  ;i++){
    //             // System.out.println(i);
    //                 last = i; 
                
    //         }
    //         int[] array = {first,last};
    //         return array;
    //     }
    //     if(arr[mid] > num){
    //         e = mid-1;
    //         return findFirstAndLastOccurence(arr, num, first, last, s, e);
    //     }else{
    //         s = mid +1;
    //         return findFirstAndLastOccurence(arr, num, first, last, s, e);
    //     }
    // }


    //! binary search + binary search for starting index
    static int findFirstOccurence(int[] arr,int num,int s,int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == num){
            if(mid == 0){
                return mid;
            }
           if( arr[mid-1] == num){
            e = mid-1;
            return findFirstOccurence(arr, num, s, e);
           }
           else{
           return mid;
           }
        }
        if(arr[mid] > num){
            e = mid-1;
            return findFirstOccurence(arr, num, s, e);
        }else{
            s = mid +1;
            return findFirstOccurence(arr, num, s, e);
        }
    }
    //! binary search + binary search for last index
    static int findLastOccurence(int[] arr,int num,int s,int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == num){
            if(mid == arr.length -1){
                return mid;
            }
           if( arr[mid+1] == arr[mid] ){
           s = mid +1;
           return findLastOccurence(arr, num, s, e);
           }
           else{
           return mid;
           }
        }
        if(arr[mid] > num){
            e = mid-1;
            return findLastOccurence(arr, num, s, e);
        }else{
            s = mid +1;
            return findLastOccurence(arr, num, s, e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int firstPos = findFirstOccurence(arr, 6, 0,arr.length -1);
        int lastPos = findLastOccurence(arr, 6, 0,arr.length -1);
        System.out.println(firstPos);
        System.out.println(lastPos);
}
}