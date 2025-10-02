//isomorphic string
import java.util.isomorphic;
public class StringEasy5 {
    public static void isomorphic(String s1,String s2){
        if (isIsomorphic(s1,s2)){
            System.out.println("yes");
        }
        else
            System.out.println("no");

    }
    public static void main(String[] args) {
       String str1="add";//would
       String str2="egg";//could
       if(str1.length()==str2.length()){
            isomorphic(str1,str2);
       }
       else
            System.out.println("Not a isomorphic string ");

        
        
    }
    
}
