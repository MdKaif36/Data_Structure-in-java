import java.util.Scanner;

public class stringBuilderPlaindrome {
    public static void main(String[] args) {
    StringBuilder builder=new StringBuilder();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the charcter");
    //char input=sc.next().charAt(0);
    StringBuilder sb=new StringBuilder();
    String str;
    //char input=sc.next().charAt(0);
    for(int i=0;i<5;i++){
      char input=sc.next().charAt(0);
        sb.append(input);
    }
    str=sb.toString();
    //String sbrev=sb.reverse().toString(str);
    StringBuilder sbrev=new StringBuilder(str); 
    String reverse=sbrev.toString();
    if(str.equals(reverse))
      System.out.println("true");
    else
      System.out.println("false");
    
    }
    
}
