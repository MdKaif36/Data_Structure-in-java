public class StringEasy4 {
    public static void main(String[] args) {
        String[] str = {"fly", "flow", "gorest"};
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) {
                break;
            }
        }
        System.out.println("The most common prefix is: " + prefix);
    }
}