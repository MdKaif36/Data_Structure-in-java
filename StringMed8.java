// reverse string 

public class StringMed8 {
    public static void main(String[] args) {
        String str="the sky is blue";
        String Reverse=reverse(str);
        System.out.println(Reverse);
        
    }
    public static String reverse(String s){
        StringBuilder new_word=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            new_word.append(c);
        }

        return new String(new_word);
    }
    
}
