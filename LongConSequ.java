import java.util.Arrays;

class LongConSequ {
    public static void main(String[] args) {
        int ar[]={100,200,1,4,3,2};
        Arrays.sort(ar);
        //1,2,3,4,100,200
        System.out.println(Arrays.toString(ar));
        int count=0,low=0,longest=1;
        for(int i=0;i<ar.length;i++){
            if(ar[i]-1==low){
                count++;
                low=ar[i];
            }
            else if (ar[i]!=low){
                count=1;
                low=ar[i];
            }
            longest=Math.max(longest,count);
        }
        System.out.println(longest);

    }
}



