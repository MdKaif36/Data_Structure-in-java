
import java.util.Scanner;

public class maxMoreHalfTimes {
    public static void main(String[] args) {
        int ar[]=new int[10],a,count1=0,count2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two type no.");
        for(int i=0;i<8;i++)
            ar[i]=sc.nextInt();
       // int ar[]={7,3,3,3,7,3,3,7} 
        int n=ar.length/2;
        a=ar[0];
        System.out.println(a);
        for(int i=0;i<8;i++){
            if(a==ar[i])
                count1++;
            else
                count2++;
        }
        if(count1>n)
            System.out.println("maximum no occur"+a+count1);
        else
            System.out.println("maximum no occur"+count2);
        
     }
}
