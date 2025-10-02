public class tuf{
    public static void main(String[] args) {
        String line="mohd;kaif;khan Hussain";
        String x=line.replace(";",":");
        System.out.println(x);
        StringBuilder sb = new StringBuilder();
        String str[] =line.split(";");
        //System.out.println(str[0]);
        String last=str[str.length-1];
        System.out.println(last);
        for(int i=0;i<last.length();i++){
            char ch=last.charAt(i);
            if(Character.isSpaceChar(ch)){
               string last=last.replace(" ","");
            }
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            } 
            else {
               sb.append(ch);
            }
        }
        System.out.println(sb);

    }
}