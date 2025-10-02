public class pattern2 {
    public static void main(String[] args) {
        char ch='A';
        for(int i=1;i<=4;i++){                     // A
            int k=i-1;                            //  BC
            for(int j=1;j<=i;j++){                //  CDE
                System.out.print((char)(ch+k));   //  DEFG
                k++;
            }
            System.out.println();
        }
    }
    
}
