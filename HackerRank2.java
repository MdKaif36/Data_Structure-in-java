//import java.util.Arrays;
//import java.util.NoSuchElementException;
import java.util.Scanner;

public class HackerRank2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        
        int ar[]=new int[size];
        
        // input array element
        System.out.println("enter the array element");
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        
        // int max=Arrays.stream(ar).max().orElseThrow(NoSuchElementException::new);
        // int min=Arrays.stream(ar).min().orElseThrow(NoSuchElementException::new);
        int max=maxvalue(ar,size);
        int min=minvalue(ar,size);
        System.out.println(min+" "+max);
        
        int maxsum=sum(ar,size,min);
        int minsum=sum(ar,size,max);
        System.out.print(minsum+" "+maxsum);
    }
    
    public static int sum(int ar[],int size,int num){
        
        int total=0;
        for(int i=0;i<size;i++){
            if(ar[i]!=num){
                total+=ar[i];
            }
        }
        return total;
    }
    
    public static int maxvalue(int ar[],int size){
        int maximum=0;
        for(int i=0;i<size;i++){
            maximum=Math.max(ar[i],maximum);
        }
        return maximum;
    }
    
    public static int minvalue(int ar[],int size){
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            minimum=Math.min(ar[i],minimum);
        }
        return minimum;
    }
}
