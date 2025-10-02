//Count Occurrences in Sorted Array
public class BinarySearch6 {
    public static void main(String[] args) {
        int ar[] = {1, 1, 2, 2, 2, 2, 2, 3};//    {1,1,1,3,4,4,4,5,6,8}
        //          0  1   2   3   4   5   6         0 1 2 3 4 5 6 7 8 9 
        int x=2;
        int low=0,high=ar.length-1,count=0;
        while(low<high){
            int medium=(low+high)/2;
            if(ar[medium]==x){
                for(int i=low;i<=high;i++){
                    if(ar[i]==x){
                        count++;
                    }
                }
                break;

            }
            else if(ar[medium]<x){
                low=medium+1;
            }
            else{
                high=medium-1;
            }
        }
        System.out.println(count);
    }
    
}
