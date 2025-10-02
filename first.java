import java.util.Scanner; 
public class first{
    public static void main(String[] args){
        int[] arr=new int[10];
        int n=0,p=0,z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array limit");
        int size=sc.nextInt();
        System.out.println("enter the size of array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0)
                p++;
            else if(arr[i]<0)
                n++;
            else
                z++;
        }   
        System.out.println(p%size);
        System.out.println(n%size);
        System.out.println(z%size);
  }
}
    
