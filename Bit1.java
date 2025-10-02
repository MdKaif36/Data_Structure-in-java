// K-th Bit is Set or Not
public class Bit1 {
    public static void main(String[] args) {
        int  num =13;
        int bit_position=1;
        String newstr=Decimal2binary(num);                // 1 1 0 1
        System.out.println(newstr.toString());    
        int i=(newstr.length()-1)-bit_position;          //  0 1 2 3
        char ch=newstr.charAt(i);
        if(ch=='1'){
            System.out.println(" Binary representation of "+num+" is "+newstr+" in which "+bit_position+" index crom LSB set , so :"+true);
        }
        else
            System.out.println("Binary representation of "+num+" is "+newstr+" in which "+bit_position+" index crom LSB set , so :"+false);
        

    }


    // function decimal to binary 
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
