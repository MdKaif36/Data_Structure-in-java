public class pattern3 {
    public static void main(String[] args) {
        char ch='E';
        for(int i=0;i<5;i++){ 
            char temp=(char)(ch-i);      
            for(int j=0;j<=i;j++){
                System.out.print((char)(temp+j));          
            }
            System.out.println();
        }
    }
    
}
