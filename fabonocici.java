// fabonicci series
import java.util.Scanner;

public class fabonocici {
    public static void fabseries(int n) {
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            int s=a+b;
            System.out.println(s);
            a=b;
            b=s;
        }


    }
    public static void main(String[] args) {
        int num;
        System.out.println("enter the two number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        fabseries(num);


    }

    
}
