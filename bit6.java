// swap two number 
public class bit6 {
    public static void main(String[] args) {
        int num1=13;    //1101
        int num2=5;    // 0101
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
        
    }

}
