//rotation of a string
public class StringEasy6 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        String s="star",goal="rats";
        int count=0;
        int size=s.length();
        for(int i=0;i<size;i++){
            char c=s.charAt(0);
            String sub=s.substring(1,s.length());
            str.append(sub);
            str.append(c);
            s=str.toString();
            str.setLength(0);
            count++;
            if(s.equals(goal)){
                System.out.println("After "+count+"Rotation word is found ");
            }
        }
        System.out.println("no word found during whole rotation");
    }
    
}
