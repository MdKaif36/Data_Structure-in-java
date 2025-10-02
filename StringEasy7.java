//anagram
public class StringEasy7 {
    static String anagram(String s){
        int size=s.length();
        StringBuilder word=new StringBuilder();
        int[] c=new int[size];
        for(int i=0;i<s.length();i++){
            c[i]=(int)s.charAt(i);
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(c[i]>c[j]){
                    int temp=c[j];
                    c[j]=c[i];
                    c[i]=temp;

                }
            }

        }
        for(int i=0;i<size;i++){
           word=word.append((char)c[i]);
        }
        return new String(word); 
    }
    public static void main(String[] args) {
        String str1="star";//arst
        String str2="rats";//arst
        if(str1.length()==str2.length()){
            String word1=anagram(str1);
            String word2=anagram(str2);
            if(word1.equals(word2))
                System.out.println("yes");
            else
                System.out.println("no");
        }
        else
            System.out.println("length of both string not same");
        
    }
    
}
