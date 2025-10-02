// selection sort
import java.util.Arrays;

public class Sorting1{
    public static void main(String[] args) {
        int[] ar={1,8,9,3,5,4,7};
        System.out.println("before sorting array: "+Arrays.toString(ar));
        for(int i=0;i<ar.length;i++){
            for(int j=i;j<ar.length;j++){
                if(ar[i]>ar[j]){
                    int temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("after sorting array: "+Arrays.toString(ar));
    }

    
}
