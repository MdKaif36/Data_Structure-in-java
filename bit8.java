// flip a bit convert to desired number
public class bit8 {
    public static void main(String[] args) {
        int number=13;  // 1101
        int desired_num=4;  // 100
        int count =0;
        String newstr="",goalstr="";
        String str1=Decimal2binary(number);
        String str2=Decimal2binary(desired_num);
        int size=Math.max(str1.length(),str2.length());
        //if(str1.length()>str2.length()){
        goalstr=equallength(str2,size);
        //}
        //if(str1.length()<str2.length()){
        newstr=equallength(str1,size);
        //}
        System.out.println("user input number: "+newstr); //1101
        System.out.println("user want to get: "+goalstr);//0100
        System.out.println("so how many filp a bits is :");
        for(int i=size-1;i>=0;i--){
            if(newstr.charAt(i)!=goalstr.charAt(i)){
                System.out.println(newstr.charAt(i));
                System.out.println(goalstr.charAt(i));
                count++;
            }
            System.out.println();

        }
        System.out.println("number of fliping binary bits from "+number+" to "+desired_num+" is: "+count);
        

        
    }


    // doing length equal
    public static String equallength(String s,int size){  //s=100
        int length=s.length();
        StringBuilder new_s=new StringBuilder();
        for(int i=0;i<size-length;i++){
            new_s.append(0);
        }
        new_s.append(s);
        return new_s.toString();
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

