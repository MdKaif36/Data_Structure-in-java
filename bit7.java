// divide number without using dividor operator using bit manupulation
public class bit7 {
    public static void main(String[] args) {
        double divident=80;
        double divisor=11;
        double i=0;
        double sum=0;
        while(divident>divisor){
            if(divident<(divisor*Math.pow(2,i))){
                divident=divident-(divisor*Math.pow(2,i-1));
                sum=sum+Math.pow(2,i-1);
                i=-1;
            }
            i++;
        } 
        System.out.println(sum);       
    }
    
}
