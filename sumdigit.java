
import java.util.*;

public class sumdigit {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int number,x,sum=0;
        System.out.println("enter the number");
        number=ob.nextInt();
        while(number>0){
            x=number%10;
            sum=sum+x;
            number=number/10;
        }
        System.out.println("sum of digit");
        System.out.println(sum);
    }
    
}
