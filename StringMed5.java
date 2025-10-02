//count substring
public class StringMed5 {
    public static void main(String[] args) {
        String str="abaca";// a ab aba abac abaca  b ba bac baca   a ac aca   c ca a
        String[] ar=new String[100];
        int k=0;
        for(int i=0;i<str.length();i++){
            int j=i;
            while(j<str.length()){
                ar[k]=str.substring(i,j);
                j++;
                k++;
            }
        }
        System.out.println(k);
    }
}
