public class StringEasy3{
    public static void main(String[] args) {
        String str="123456";
        int largestodd=Integer.MIN_VALUE;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                String strsub=str.substring(i,j);
                int strnum=Integer.parseInt(strsub);
                if(strnum%2!=0){
                    if(strnum>largestodd)
                        largestodd=strnum;
                }
            }
        }
        System.out.println("largest odd String in a String: "+largestodd);
    }
}