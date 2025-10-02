// count the number of set bit from 1 to n 
public class bit4 {
    public static void main(String[] args) {
        int count =1;
        int number=4;

        for(int i=1;i<=number;i++){
            String newstr=Decimal2binary(i); 
            for(int j=0;j<newstr.length();j++){
                char ch=newstr.charAt(j);
                if(ch=='1'){
                    count++;
                }
            }  
        }
        System.out.println(count);
        
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
