// print n no.
import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("enter the last element of series");
        int n;
        n=ob.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i);
            
        }
    }
}
