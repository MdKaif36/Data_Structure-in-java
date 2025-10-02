
import java.util.Arrays;

//recursive bubble sort
public class sorting5 {
    static void Bubble_Sort(int[] ar,int n){
        if(n==1){
            System.out.println("after sorting array: "+Arrays.toString(ar));
            return;
        }
        for(int i=0;i<n-1;i++){
            if(ar[i]>ar[i+1]){
                int temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }

        }
        Bubble_Sort(ar,n-1);
    }
    public static void main(String[] args) {
        int[] ar={13, 46, 24, 52, 20, 9};
        int size=ar.length;
        System.out.println("before sorting array: "+Arrays.toString(ar));
        Bubble_Sort(ar,size);
    }
    
}
