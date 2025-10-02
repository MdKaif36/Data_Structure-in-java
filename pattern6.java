public class pattern6 {
    public static void main(String[] args) {
        int size=4;
        int q=0;
        int temp=0;
        for(int i=1;i<=size;i++){
            int n=i;
            int k=size-i;
            for(int j=1;j<=4;j++){
                if(j<=k){
                    System.out.print(" ");
                }
                else{
                    System.out.print(n);
                    n++;
                }
            }
            temp=q;
            for(int p=1;p<size;p++){
                if(i>p){
                    
                    System.out.print(q);
                    q--;

                }
                else{
                    System.out.print(" ");
                }
                
            }
            q=temp;
            q=q+2;
            System.out.println();

        }
    }
    
}
