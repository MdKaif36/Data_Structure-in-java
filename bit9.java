
import java.util.Arrays;

// find the number which appear once 
public class bit9 {
    public static void main(String[] args) {
        int ar[]={1,3,4,2,2,1,3};
        int count=0;
        for(int i=0;i<ar.length;i++){
            count=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("the number which appear once in "+Arrays.toString(ar)+" is  = "+ar[i]);
            }
        }
    }
    
}
