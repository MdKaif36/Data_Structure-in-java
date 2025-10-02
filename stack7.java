// next greater  integer

public class stack7 {
    public static void main(String[] args) {
        int ar1[] = {5,7,1,2,6,0};
        int[] ar2=new int[ar1.length];

        System.out.println("Input array is: ");
        System.out.print("[ ");
        for(int i=0;i<ar1.length;i++)
            System.out.print(ar1[i]+" ");
        System.out.println("]");  

        for(int i=0;i<ar1.length;i++){
            ar2[i]=nextgreaterint(ar1[i],i,ar1);
        }
        System.out.println("Next Greater INteger of array is: ");
        System.out.print("[ ");
        for(int i=0;i<ar1.length;i++)
            System.out.print(ar2[i]+" ");
        System.out.println("]");  
    }

    static int nextgreaterint(int n,int start,int ar1[]){            // {5,7,6,2,1,0}
                                                                    //   0 1 2 3 4 5
        int end=start+1;
        while(start!=end){
            if(end>=ar1.length){
                end=end%ar1.length;
            }
            if(n<ar1[end]){
                return ar1[end];
            }
            end++;
        }
        return -1;
    }
    
}
