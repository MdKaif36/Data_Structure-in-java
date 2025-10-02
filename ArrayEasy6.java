//Right and Left move by Dth place
import java.util.Arrays;
import java.util.Scanner;
public class ArrayEasy6 {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7};
        int[] br=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the how many rotation Want");
        int D=sc.nextInt();
        //D=3
        System.out.println("Enter the option");
        System.out.println("Select 1 for Right Rotate Dth place either Select 2 for left Rotate Dth place");
        //Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        switch(opt){
            case 1:
            //0 1 2 3 4 5 6
           //{1,2,3,4,5,6,7}
            //{5,6,7,1,2,3,4}
                for(int i=D+1,j=0;i<=ar.length+D;i++,j++){
                    if(i<ar.length)
                        br[j]=ar[i];
                    else
                        br[j]=ar[i-ar.length];

                }
                //break;
                System.out.println(Arrays.toString(br));
                break;
            case 2:
                for(int i=D,j=0;i<ar.length+D;i++,j++){
                    if(i<ar.length)
                        br[j]=ar[i];
                    else
                        br[j]=ar[i-ar.length];
                }
                System.out.println(Arrays.toString(br));
                break;
            default:
                System.out.println("Enter only 1 and 2 button");
        }
    }
    
}
