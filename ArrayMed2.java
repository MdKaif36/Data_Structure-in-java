
import java.util.Arrays;

//sort array from 0,1 and 2
public class ArrayMed2 {
    public static void main(String[] args) {
        int[] Ar={2,0,2,1,1,0};
        for(int i=0;i<Ar.length;i++){
            for(int j=i+1;j<Ar.length;j++){
                if(Ar[i]>Ar[j]){
                    int temp=Ar[i];
                    Ar[i]=Ar[j];
                    Ar[j]=temp;
                }
                //swap(Ar[i],Ar[j]);
            }
        }
        System.out.println(Arrays.toString(Ar));
    }
    
}
