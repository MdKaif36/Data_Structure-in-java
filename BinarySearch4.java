// insret element in array using Binarysearch algorithm
import java.util.Scanner;
public class BinarySearch4{
    public static void main(String[] args) {
        //int[] ar={1,3,5,7,9,11,14,19,23,_};
                //  0 1 2 3 4  5  6  7  8 9      size=9
        System.out.println("enter the array size: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int ar[]=new int[size+1];
        System.out.println("Enter the array element in sorted way: ");
        for(int i=0;i<size;i++)
            ar[i]=sc.nextInt();
        int low=0,high=size-1;
        System.out.println("which integer element you want to insert: ");
        int insert=sc.nextInt();       //13
        while(low<=high){
            int medium=(low+high)/2;
            //int[] ar={1,3,5,7,9,11,14,14,19,23}
                      //0 1 2 3 4  5  6  7 8 9
            if(ar[medium]<insert&&ar[medium+1]>insert){
                for(int i=size;i>medium+1;i--){
                    ar[i]=ar[i-1];
                }
                ar[medium+1]=insert;
            }
            else if(ar[medium]>insert){
                high=medium-1;
            }
            else{
                low=medium+1;
            }
        }
        
        System.out.println("Updated array: ");
        for (int i = 0; i <= size; i++) {
            System.out.print(ar[i] + " ");
        }
        //int[] ar={1,3,5,7,9,11,14,19,23,_};
        
    }
}