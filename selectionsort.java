public class selectionsort {
    public static void main(String[] args) {
        int ar[]={2,5,6,9,24,85,34},min=0;
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length-1;j++){
                if(ar[i]<ar[j]){
                    min=ar[i];
                }
            }
            int temp=ar[i];
            ar[i]=min;
            min=temp;


        }
        for(int i=0;i<ar.length+1;i++){
            System.out.println(ar[i]);
        }
    }
    
}
