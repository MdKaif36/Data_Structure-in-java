//maximum Substring
public class StringMed6 {
    public static void main(String[] args) {
        String str="babad";
        int max=0;
        StringBuilder word=new StringBuilder();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                String substr=str.substring(i,j+1);
                System.out.print(substr+"_");
                for(int k=substr.length()-1;k>=0;k--){
                    char c=substr.charAt(k);
                    word.append(c);
                }
                System.out.print(word+"_");
                if(substr.equals(word.toString())){
                    System.out.println("yes_"+substr.length());
                    max=Math.max(max,substr.length());
                }
                else{
                    System.out.println("no");
                }
                word.setLength(0);
                System.out.println();

                
            }    
        }  
        System.out.println("maximum substring:"+max);      
        
    }
}
