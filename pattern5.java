public class pattern5 {
    public static void main(String[] args) {
        int size=4;
        for(int i=1;i<=size;i++){
            int k=size-i;
            int n=1;
            for(int j=1;j<=size;j++){
                if(j<=k){
                    System.out.print(" ");
                }
                else{
                    System.out.print(n);
                    n++;
                }
                
            }
            System.out.println();
        }
    }
    
}
