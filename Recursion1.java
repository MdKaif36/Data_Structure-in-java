// x raised to the power n 
public class Recursion1 {
    static double power(double cal,int x,int n){
        if(n>0){
           cal*=x;
           return power(cal,x,n-1); 
        }
        else{
            return cal;
        }

    }
    public static void main(String[] args) {
        int num=2, pow=10;
        double ans=power(1,num,pow);
        System.out.println(ans);
        
    }
}
