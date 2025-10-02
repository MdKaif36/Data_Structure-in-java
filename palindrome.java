
import java.util.Scanner;

public class palindrome {
    public static void palndrm(int n) {
        int m, rev = 0,p=n;
        while (n != 0) {
            m = n % 10;
            rev = rev * 10 + m;
            n = n / 10;
        }
        if (p== rev)
            System.out.println("given no. is palindrome");
        else
            System.out.println("given no. is not a palindrome");
    }

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        num = sc.nextInt();
        palndrm(num);
    }
}
