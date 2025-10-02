public class smallest {
    public static void main(String[] args) {
        int[] ar={9,5,2,7,3,6};
        int smallest=ar[0];
        for(int i=0;i<ar.length;i++){
            //smallest=ar[1];
            //for(int j=1;j<ar.length;j++){
            if(ar[i]<smallest)
                smallest=ar[i];

        }
        System.out.println(smallest);
    }
    
}
