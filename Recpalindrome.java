import java.util.Scanner;

public class Recpalindrome {
    public static int palindrome(int n, int s) {
        if (n > 0) {
            s = (s * 10) + (n % 10);
            s= palindrome(n / 10, s);
        }
        return s;
    }

    public static void main(String[] args) {
        int num, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();
        temp = num;
        int reverse = palindrome(num, 0);
        if (temp == reverse)
            System.out.println("Given number is a palindrome.");
        else
            System.out.println("Given number is not a palindrome.");
    }
}