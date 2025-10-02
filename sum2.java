public class sum2 {
    public static void main(String[] args){
        int ar[]={1,4,7,8,11},target=15;
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(ar[i]+ar[j]==target){
                    System.out.println("yes");
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
