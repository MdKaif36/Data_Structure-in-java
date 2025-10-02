// xor from n to m 
public class bit11 {
    public static void main(String[] args) {
        int first=4;
        int last=8;
        String lastlength=Decimal2binarylast(last);      // 1000
        int length=lastlength.length();                  // 4
        String str1="",str2="";
        StringBuilder xorstr=new StringBuilder();
        
        for(int i=first+1;i<=last;i++){
            if(xorstr.length()==0){
                str1=Decimal2binary(first,length);       //  0100
            }
            else{
                str1=xorstr.toString();
            }
            str2=Decimal2binary(i,length);        // 5   // 0101
            xorstr.setLength(0);
            for(int j=length-1;j>=0;j--){
    
                char ch1=str1.charAt(j);
                char ch2=str2.charAt(j);
                if(ch1=='1'&&ch2=='0'||ch1=='0'&&ch2=='1'){
                    xorstr.append(1);
                }
                else{
                    xorstr.append(0);
                }

            }
            xorstr.reverse();
        }
        System.out.println(xorstr.toString());
        

        

        
        
        
    }


    //equal length function
    public static String equallength(String str1,int length){
        StringBuilder newstr =new StringBuilder();
        for(int i=str1.length();i<length;i++){
            newstr.append(0);
        }
        newstr.append(str1);

        return newstr.toString();
    }


    // decimal to binary function
    public static String Decimal2binary(int n,int length){
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
        return equallength(str.toString(),length);

    }


    public static String Decimal2binarylast(int n){
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
