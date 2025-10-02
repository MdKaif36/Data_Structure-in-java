// 2nd largest in array
import java.util.Scanner;

public class greatest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size, ar[]=new int[10],max1=0,max2=-1;
        System.out.println("enter the size of array");
        size=sc.nextInt();
        System.out.println("enter the array element");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(ar[i]);
        }
        System.out.println();
        for(int i=0;i<size;i++){
            if(ar[i]>max1){
                max2=max1;
                max1=ar[i];
            }
            else if (ar[i]>max2)
                     max2=ar[i];
        }
        System.out.println("second largest element in array :"+max2);


    }
    
}
