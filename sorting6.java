// recursion insertion sort

import java.util.Arrays;

public class sorting6 {
    static void Insertion_sort(int[] ar,int i){
        if(i==ar.length){
            System.out.println("after sorting array: "+Arrays.toString(ar));
            return;
        }

        for(int j=i;j>0;j--){
            if(ar[j-1]>ar[j]){
                int temp=ar[j-1];
                ar[j-1]=ar[j];
                ar[j]=temp;
            }
            
        }
        Insertion_sort(ar, i+1);
    }
    public static void main(String[] args) {
        int[] ar={13, 46, 24, 52, 20, 9};
        System.out.println("before sorting array: "+Arrays.toString(ar));
        Insertion_sort(ar,1);
    }
    
}
