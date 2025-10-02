//maximum nesting parenthesis
public class StringMed2 {
    public static void main(String[] args) {
        String str="(1+(2*3)+((8)/4))+1";                //"()(())((()()))"
        int count=0;
        char c;
        int max=0,num;
        for(int i=0;i<str.length();i++){
            c=str.charAt(i);
            if(c=='('){
                count++;
            }
            else
            if(c==')'){
                count--;
            }
            else{
                num=count;
            }
            max=Math.max(count,max);

        }
        System.out.println("maximum nesting parenthesis: "+max);

    }
    
}
