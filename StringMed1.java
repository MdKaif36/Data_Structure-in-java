//sort character by frequency
public class StringMed1 {
    public static void main(String[] args) {
        String str = "Aababb";//A,A,A,c,b,b       A,A,A,b,b,c
        int size = str.length();//1,2,3,3,4,4,4   4,4,4,3,3,2,1
        char[] c=str.toCharArray();
        int count1=0,max=-1;
        for(int i=0;i<size;i++){
            count1=0;
            for(int j=0;j<size;j++){
                if(c[i]==c[j]){
                    count1++;
                }
            }
            max=Math.max(max,count1);
        }
        int count2=0,max2=-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j+){
                    count2++;
                }

            }
        }

        
        
    }

}
