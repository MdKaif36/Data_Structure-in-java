//count of beauty substring beauty substring = maximum appear-least apear;
// beauty substrings=4-1=3 so all substring having follow this 
public class StringMed7 {
    public static void main(String[] args) {
        String str="aabcbaa";
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
        int count=0;
        for(int i=0;i<k;i++){
            if(ar[i].length()>1)
                count++;
        }
        System.out.println(count);
    }
}
