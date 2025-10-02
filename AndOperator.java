import java.util.Scanner;
public class AndOperator {
    public static void main(String[] args) {
        String a,b;
        StringBuilder str=new StringBuilder();
        System.out.println("Enter the binary string value  a and b: ");
        Scanner sc=new Scanner(System.in);
        a=sc.next();  // 1011
        b=sc.next();  // 0011
        for(int i=a.length()-1;i>=0;i--){
            int c=Integer.parseInt(String.valueOf(a.charAt(i)));
            int d=Integer.parseInt(String.valueOf(b.charAt(i)));
            //System.out.println(c+" "+d);
            if(c==1&&d==1){
                str.append(1);
            }
            else{
                str.append(0);
            }
        }
        str.reverse();
        System.out.println(str.toString());


    }
    
}
