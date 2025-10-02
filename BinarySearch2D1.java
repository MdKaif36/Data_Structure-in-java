// find row which having max no. of '1'
public class BinarySearch2D1 {                             //  1 0 1
                                                           //  0 0 1
                                                           //  1 1 1
    public static void main(String[] args) {

        // do with withouut binary search algo
        int[][] ar={{1,0,1},{0,0,1},{1,1,1}};
        int rlow=0,clow=0,rhigh=ar.length,chigh=ar[0].length,count,max=0,row_location=0;
        for(int i=0;i<rhigh;i++){
            count=0;
            for(int j=0;j<chigh;j++){
                if(ar[i][j]==1){
                    count++;
                }
            }
            max=Math.max(count,max);
            if(count==max){
                row_location=i;
            }
        }    
        System.out.println(row_location);      
        
        
        // 

    }
    
}
