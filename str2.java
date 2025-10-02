
public class str2{
    public static boolean palindrome(String input){
        int left=0;
        int right=input.length()-1;
        while(left<right){
            if(input.charAt(left)==input.charAt(right)){
                return true;
            }
            left++;
            right--; 
        }
        return false;
    }
    public static void main(String[] args) {
        String str="traqm";
        System.out.println(palindrome(str));

    }

}