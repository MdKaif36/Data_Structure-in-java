// move zero at the end 
import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        int size,temp;
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[10],count=0;
        System.out.println("enter the size of array");
        size=sc.nextInt();
        System.out.println("enter the array");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.print(ar[i]);
        }
        for (int i = 0; i <size; i++) {
            //{1,0,5,0,0,0,9}
            if(ar[i]!=0){
                temp=ar[i];
                ar[i]=ar[count];
                ar[count]=temp;
                count++;
            }

        }
        System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(ar[i]);
        }
        
    }
}
