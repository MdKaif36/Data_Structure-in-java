//2 Sum 
class ArrayMed1 {
    public static void main(String[] args) {
        int ar[]= {2, 6, 5, 8, 11};
        int target = 17;
        int left=0,right=ar.length-1;
        /*while(left<right){
            int sum=ar[left]+ar[right];
            if(sum==target){
                System.out.println("yes");
            }
            else if (sum<target)
                left++;
            else
                right--;
        }*/
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]+ar[j]==target){
                    System.out.println("yes");
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    
}


