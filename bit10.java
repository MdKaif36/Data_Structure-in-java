// subset

public class bit10 {
    public static void main(String[] args) {
        int[] ar={1,2,3};
        int count=0;
        for(int k=0;k<ar.length;k++){
            for(int i=k;i<ar.length;i++){
                count=0;
                System.out.print("(");
                for(int j=k;j<=i;j++){
                    System.out.print(ar[j]+" ");
                    
                    
                }
                System.out.print(")");
            }
        }
    }
    
}
