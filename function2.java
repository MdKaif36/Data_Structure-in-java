// factorial of given no.
import java.util.Scanner;

public class function2 {
    public static int fact(int n){
        int fac=1;
        for(int i=n;i>0;i--){
            fac=fac*i;
        }
        return fac;

    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        num= sc.nextInt();
        System.out.println("factorial of given number:"+fact(num));
    }
}
