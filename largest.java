
import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        int max=0,size, ar[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        System.out.println("enter the array element");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();

        }
        for (int i = 0; i < size; i++) {
            if(ar[i]>ar[i+1]){
                max=ar[i];

            }
            else
                max=ar[i+1];
        }
    System.out.println("maximum no in array :"+max);
    
    }
}
