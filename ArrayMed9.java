//leader of array
public class ArrayMed9 {
    public static void main(String[] args) {
        int[] ar={4, 7, 1, 0};
        for(int i=1;i<ar.length;i++){
            if(ar[i]>=ar[ar.length-1])
                System.out.print(ar[i]+" ");
        }
    }
    
}
