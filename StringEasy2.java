public class StringEasy2 {
    public static void main(String[] args) {
        String Str="madam";
        StringBuilder newstring=new StringBuilder();
        for(char c:Str.toCharArray()){
            newstring.append(c);
        }
        if(Str.equals(newstring.toString()))
            System.out.println("yes it is palindrome");
        else
            System.out.println("no it is not a palindrome");
    }
    
}
