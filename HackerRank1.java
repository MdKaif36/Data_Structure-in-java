
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
class HackerRank1{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        int ar[] =new int [size];
        
        // get element in array   {1,1,0,-1,-1}

        System.out.println("enter the array");
         
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        
       
        int positive=count(ar,1,size);
        roundoff(positive, size);
        int zero=count(ar,0,size);
        roundoff(zero, size);
        int negative=count(ar,-1,size);
        roundoff(negative, size);
        
        
    }
    
    public static int count(int[] br,int n,int size){
        int countnum=0;
        for(int i=0;i<size;i++){
            if(n==0){
                if(br[i]==0){
                    countnum++;
                }
            }
            if (n>0) {
                if(br[i]>=n){
                    countnum++;
                }
                
            }
            if(n<0){
                if(br[i]<=n){
                    countnum++;
                }
            }
        }
        return countnum;
        
    }

    public static void roundoff(int num,int size){
        double proportion=(double)num/size;
        BigDecimal bd=new BigDecimal(proportion);
        BigDecimal roundedValue = bd.setScale(6, RoundingMode.HALF_UP);
        System.out.println(roundedValue);
    }
}