import java.util.Scanner;
class HackerRank5{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers in Binary: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int l1=str1.length();
        int l2=str2.length();
        int max=Math.max(l1,l2);
        System.out.println(max);
        
        String newstr1=equalLength(str1,max);
        String newstr2=equalLength(str2,max);

        System.out.println(newstr1);
        System.out.println(newstr2);
        
        
        //equalLength(str1,str2);
        String result=xor(newstr1,newstr2,max);
        System.out.println(result);
    }
    
    static String xor(String newstr1, String newstr2,int max){
        StringBuilder sbResult=new StringBuilder();
        for(int i=0;i<max;i++){
            char ch1=newstr1.charAt(i);
            char ch2=newstr2.charAt(i);
            if(ch1==ch2){
                sbResult.append(0);
            }
            else{
                sbResult.append(1);
            }
        }
        return sbResult.toString();
    }
    
    static String equalLength(String s1,int max){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<max-s1.length();i++){
            sb.append(0);
        }
        sb.append(s1);
        return sb.toString();
    }
    
     
}

