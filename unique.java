
import java.util.Scanner;


public class unique {
    public static void main(String[] args) {
        //int ar[]={8,2,5,8,5,2,3};
        //nt count=0;
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int[] ar=new int [size];
        for (int i = 0; i < 7; i++) {
            int count=0;
            for(int j=0;j<7;j++){
                if(ar[i]==ar[j])
                    count++;
            }
            if(count==1)
                System.out.println(ar[i]);
        }
       
    }
    
}
