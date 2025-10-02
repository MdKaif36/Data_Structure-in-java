// check mo is armstrong or not 
import java.util.Scanner;

public class armstrongno {
    public static void arm(int n){
        int s,sum=0;
        int dup;
        dup=n;
        while(n!=0){
            s=n%10;
            sum=sum+s*s*s;
            n=n/10;
            
        }
        if(sum==dup)
            System.out.println("it is armstrong no.");
        else 
            System.out.println("given no. is not a armstrong no. ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=sc.nextInt();
        arm(num);

    }
}
