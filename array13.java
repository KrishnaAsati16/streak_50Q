//count the occurance of elements 
import java.util.Arrays;

public class array13 {

    public static void main(String[] args) {
        int arr[] = {6,6,6,6,6,6,4,4,4,4,4,9,9,9};
        countOccurence(arr);
    }

    static void countOccurence(int arr[]){
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            int count = 1;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                } else {
                    break;
                }
            }

            System.out.println(arr[i] + " -> " + count);

            i += (count - 1); // skip counted elements
        }
    }
}

