public class ArrayDuplicate {
    public static void main(String[] args) {
        int ar[]={2,4,7,8,1,3,2};
        int count=0,dupl=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j])
                    count++;
                    dupl=ar[j];
            }
        }
        if(count>1)
            System.out.println("Array contain duplicate value which is "+ dupl);
        else
            System.out.println("Array not contain duplicate value.");
    }
    
}
