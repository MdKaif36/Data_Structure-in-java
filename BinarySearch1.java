public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr={1,5,7,13,17,19,23,31,37};
                // 0 1 2  3 4  5  6  7   8   
        int find=31;
        int ans=binary(arr,find);
        System.out.println("location of a required element in array: "+ans);
    }

    // function
    static int  binary(int ar[], int search){
        int location=0;
        int first=0,last=ar.length-1,medium=0;
        while(ar[medium]!=search){
            medium=(first+last)/2;
            if(ar[medium]==search){
                location=medium;
            }
            else if(ar[medium]>search){
                last=medium;
            }
            else{
                first=medium;
            }

        }
        return location;
    }
}
