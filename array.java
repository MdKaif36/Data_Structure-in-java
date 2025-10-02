// print array element
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int size;
        int Ar[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("size of the array");
        size=sc.nextInt();
        System.out.println("enter the array element :");
        for(int i=0;i<size;i++){
            Ar[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(Ar[i]);

         }

    }
}
