// check no. is prime or not
import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int number,count=0;
        number= ob.nextInt();
        for (int i = 2; i <=number; i++) {
                if(number%i==0)
                    count=count+1;  
            }
        if(count==1){
            System.out.println("it is prime no.");
        }
        else
            System.out.println("it is not a prime no.");

            
        
    }
    
}
