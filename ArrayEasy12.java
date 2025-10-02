//find the number that appear once and twice
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEasy12 {
    public static void main(String[] args) {
        int ar[]={1,1,2,5,6,7,7,8};
        int count1=0,count2=0;
        System.out.println("Enter the what u see. ");
        System.out.println("click button 1 for appear once and click button  2 for appear number twice");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        switch(opt){
            case 1:
                System.out.println("The number which appear once");
                for(int i=0;i<ar.length;i++){
                    count1=0;
                    for(int j=0;j<ar.length;j++){
                        if(ar[i]==ar[j])
                            count1++;
                    }
                    if(count1==1)
                        System.out.println(ar[i]);
                }
                break;
            case 2:
            //1,2,5,6,1,8,7,7
            //1,1,2,5,6,7,7,8
                System.out.println("The number which appear twice");
                Arrays.sort(ar);
                for(int i=0;i<ar.length-1;i++){
                    if(ar[i]==ar[i+1])
                        System.out.println(ar[i]);
                
                }
            
        }
    }
    
}
