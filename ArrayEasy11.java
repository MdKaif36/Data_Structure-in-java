public class ArrayEasy11 {
    // maximum consecutive one
    public static void main(String[] args) {
        int ar[]={1,3,1,1,0,1,1,1,1,1};
        //{1,2,3,4,5,6}
        int count=1,maxcount=0;
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==1&&ar[i+1]==1){
                count++;
                maxcount=Integer.max(maxcount,count);
            }
            else 
                count=1;
        }
        System.out.println(maxcount);
        //System.out.println(n);
    }
    
}
