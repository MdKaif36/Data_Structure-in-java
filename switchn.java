import java.util.Scanner;

public class switchn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("for english press 1");
        System.out.println("for hindi press 2");
        System.out.println("for german press 3");
        System.out.println("invalid press only 1 to 3");
        System.out.println("enter the button");
        int button = sc.nextInt();
        

        switch(button) {
        case 1:
             System.out.println("hello");
             break;
        case 2:
             System.out.println("Namaste");
             break;
        case 3:
            System.out.println("guta morgan");
            break;

        default: 
            System.out.println("invalid");
            break;
        }
    
    }
}
