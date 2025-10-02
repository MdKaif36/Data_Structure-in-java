// sum of two no.
import java.util.Scanner;

public class function1 {
    public static int sumTwonum(int a,int b){
        int s= a+b;
        return s;

    }

    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number");
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum = sumTwonum(num1,num2);
        System.out.println("sum of two number:"+sum);
    }
}
