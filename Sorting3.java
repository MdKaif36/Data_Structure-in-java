// insertion sort
import java.util.Arrays;
public class Sorting3 {
    public static void main(String[] args) {
        int[] ar={13,46,24,52,20,9};
        System.out.println("before sorting array is: "+Arrays.toString(ar));
        for(int i=1;i<ar.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(ar[j-1]>ar[j]){
                    int temp=ar[j];
                    ar[j]=ar[j-1];
                    ar[j-1]=temp;
                }
            }
        }
        System.out.println("after sorting array is: "+Arrays.toString(ar));
    }
    
}
