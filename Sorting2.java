//bubble sort
import java.util.Arrays;

public class Sorting2 {

   // System.out.println("before sorting array: "+Arrays.toString(ar));
    public static void main(String[] args) {
        int[] ar={13,46,24,52,20,9};
        System.out.println("before sorting array: "+Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                        ar[j]=ar[j+1];
                        ar[j+1]=temp;
                }
                
            }
        }
        System.out.println("after sorting array: "+Arrays.toString(ar));
    }
    
}
