public class KadaneAlgo {
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4},s=0,sum=0;
        for(int i=0;i<ar.length;i++){
            if(sum>=s){
              s=s+ar[i];
              sum=s;
            }


        }
        //for(int i=0;i<9;i++){
          //  if(ar[i]>0)
            //    s=s+ar[i];
        //}
        System.out.println("maximum sum of subarray"+s);
    }
}
