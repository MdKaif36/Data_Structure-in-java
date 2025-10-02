//Maximum SubArrays sum by using Kadane algo.
public class ArrayMed4 {
    public static void main(String[] args) {
        int[] ar={-2,-3,4,-1,-2,1,5,-3};
        int maxi=ar[0],sum=0,left=0,count=-1;
        for(int i=0;i<ar.length;i++){
            sum+=ar[i];
            if(sum<0)
                sum=0;
            else{
                maxi=Integer.max(maxi,sum);
                //count++;
            }
        
        }
        System.out.println("Maximum subarray sum: "+maxi);
    }
    
}
