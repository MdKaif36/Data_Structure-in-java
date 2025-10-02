// power of 2
public class bit3 {
    public static void main(String[] args) {
        int num=1; 
        String newstr=Decimal2binary(num);   
        double i=0;
        while(num>=Math.pow(2,i)){
            if(num==Math.pow(2,i)){
                System.out.println("true");
                break;
            }
            i++;
        }
        if(num!=Math.pow(2,i))
            System.out.println("false");
        
    }

    public static String Decimal2binary(int n){
        StringBuilder str = new StringBuilder();
        while(n!=1){
            if(n%2==0){
                str.append(0);
            }
            else{
                str.append(1);                
            } 
            n=n/2;                                 
            if(n==1){
                str.append(1);
            }
        }
        str.reverse();
        return str.toString();

    }
    
}
