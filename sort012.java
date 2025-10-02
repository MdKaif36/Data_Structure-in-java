public class sort012 {
    public static void main(String[] args) {
        int ar[]={0,1,0,2,0,1},temp=0;
        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                 if(ar[i]>ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                 }
                
            }
        }
        for(int i=0;i<6;i++)
            System.out.println(ar[i]);
    }
}
