
import java.util.Scanner;

public class Rfact {

    public static void fact(int n,int p){
        if(n==1)
            System.out.println(p);
        else{
            p=p*n;
            n--;
            fact(n,p);
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the number");
        num=sc.nextInt();
        fact(num,1);
    }
}
