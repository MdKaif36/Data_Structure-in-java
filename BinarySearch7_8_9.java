
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch7_8_9 {
    public static void main(String[] args) {
        int ar[]={4,5,6,7,0,1,2,3};//{9,14,17,19,3,5,6,7}
        //        0 1 2 3 4 5 6 7
         //       0,1,2,3,4,5,6,7
        Scanner sc=new Scanner(System.in);
        int count=1,first=0,last=ar.length-1;
        System.out.println("Enter the option which you want to seach: ");
        System.out.println("If you want to check given no. is save in which address: press 1 ");
        System.out.println("If you want to check given no. is save in array or not: press 2 ");
        System.out.println("If you find minimum no in array: press 3 ");
        System.out.println("If you find maximum no in array: press 4 ");
        System.out.println("Enter which option you want: ");
        int option=sc.nextInt();
        for(int i=0;i<ar.length-1;i++){
            if(ar[i]<ar[i+1]){
                count++;
            }
            else
                break;
        }
        System.out.println(count);
        //{4,5,6,7,0,1,2,3}  
        for(int i=0;i<count;i++){
            int temp=ar[0];
            for(int j=1;j<ar.length;j++){
                ar[j-1]=ar[j];
            }
            ar[ar.length-1]=temp;
        }
        System.out.println(Arrays.toString(ar));
        switch(option){
            //  to see element through address 01234567
            case 1:{
                int location=0;
                System.out.println("Enter the Number");
                int num=sc.nextInt();//2
                while(first<last){
                    int medium=(first+last)/2;
                    if(ar[medium]==num){
                        location=medium;
                        break;
                    }
                    else if(ar[medium]>num){
                        last=medium;
                    }
                    else{
                        first=medium;
                    }
        
                }
                if(location>4)
                    System.out.println("location of "+num+" at address "+(location-count));
                else
                    System.out.println("location of "+num+" at address "+(location+count));
            }
            break;
              
            // return true if given value is in array otherwise false
            case 2:{
                int location=0;
                System.out.println("Enter the Number");
                int num=sc.nextInt();//2
                while(first<last){
                    int medium=(first+last)/2;
                    if(ar[medium]==num){
                        System.out.println("true");
                        break;
                    }
                    else if(ar[medium]>num){
                        last=medium;
                    }
                    else{
                        first=medium;
                    }
        
                }
            }
            break;
            case 3:{
                // minimum vaue in array and which place 
                System.out.println("minimum value in array is: "+ar[0]+" at address"+count);
            }
            break;
            case 4:{
                // maximum value in array at which place
                System.out.println("maximum value in array is: "+ar[ar.length-1]+" at address"+(ar.length-count));
            }
            default:{
                System.out.println("press only 1 to 4 option ");
                System.out.println("thank you ");
            }
        }
    }

    
}
