public class StringEasy1 {
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;//"(,(,),)"
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if (c == '(') {
                if (count > 0) {
                    result.append(c);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(())"));
    }
}