// how many times array is rotated
import java.util.Arrays;
public class BinarySearch10 {
    public static void main(String[] args) {
        int ar[]={4,5,6,7,0,1,2,3};
        int count=1;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]<ar[i+1]){
                count++;
            }
            else
                break;
        }
        System.out.println("Array is rotated by: "+ count+" times");
        //{4,5,6,7,0,1,2,3}  
        for(int i=0;i<count;i++){
            int temp=ar[0];
            for(int j=1;j<ar.length;j++){
                ar[j-1]=ar[j];
            }
            ar[ar.length-1]=temp;
        }
        System.out.println(Arrays.toString(ar));
    }
    
}
