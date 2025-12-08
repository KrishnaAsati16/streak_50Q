import java.util.Arrays;

public class array18 {
    public static void main(String[] args) {
         // sort - > ascending order
        int[] arr1 = {-3,-1,-96,5,4,8,0,117,69};
        int [] arr2 = {-1,-3,5,8};
       
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("array 1:");
        print(arr1);

        System.out.println("array 2:");
         print(arr2);

           System.out.println();
        System.out.println("Intersection: ");
        findIntersection(arr1,arr2);

    }
    
    public static void print(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
      
    }
    public static void findIntersection (int[]a, int[]b) {
        int i = 0,j=0;
         while(i < a.length && j < b.length){
            if(a[i] == b[j]){
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println();
    }
}

