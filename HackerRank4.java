import java.util.Scanner;
public class HackerRank4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        String binary=tobinary(num);
        System.out.println(binary);
        String flip=flippingbit(binary);
        System.out.println(flip);
        long decimal=intoDecimal(flip);
        System.out.println(decimal);
    }

    static String tobinary(int num) {
        String binarynum=Integer.toBinaryString(num);
        int length=binarynum.length();
        StringBuilder sb=new StringBuilder();
        
        for(int i=length;i<32;i++){
            sb.append(0);
        }
        sb.append(binarynum);
        return sb.toString();
    }
    
    static String flippingbit(String binary){
        StringBuilder sbFlip=new StringBuilder();
        for(int i=0;i<32;i++){
            char  ch=binary.charAt(i);
            if(ch=='1'){
                sbFlip.append(0);
            }
            else{
                sbFlip.append(1);
            }
        }
        return sbFlip.toString();
    }
    
    static long intoDecimal(String flip){
        long sum=0;
        int j=31;
        for(int i=0;i<32;i++){
            char ch=flip.charAt(i);
            int c=Character.getNumericValue(ch);
            double temp=Math.pow(2,j)*c;
            sum+=temp;
            j--;
            
        }
        return sum;
    }
}