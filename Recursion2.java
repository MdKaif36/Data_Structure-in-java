
import java.math.BigInteger;

// A digit string is good if the digits (0-indexed) at even indices are even and the digits 
// at odd indices are prime (2, 3, 5, or 7).

public class Recursion2 {
    public static void main(String[] args) {
    int size=50;
    BigInteger total=BigInteger.ONE;
    goodnumber(size,size,total);
    }

    static void goodnumber(int n, int digitsize,BigInteger total){
        if(n==0){
            System.out.println("Total number of Goodnumber of using "+digitsize+" digits are:"+total);
            return;
        }
        else if(n%2==0){    // check n digit_place is even or not   can be fill no. 0,2,4,6,8= total=5
            total=total.multiply(BigInteger.valueOf(5));
        }
        else{
            total=total.multiply(BigInteger.valueOf(4));
        }
        n--;
        goodnumber(n,digitsize,total);
    }
}
