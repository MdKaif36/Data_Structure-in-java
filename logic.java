
import java.util.Arrays;

public class logic {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6};
        int[] br=new int[7];
        int D=3;
        for(int i=D,j=0;i<ar.length+D;i++,j++){
            if(i<ar.length)
                br[j]=ar[i];
            else
                br[j]=ar[i-ar.length];
        }
        System.out.println(Arrays.toString(br));

    }
    
}
