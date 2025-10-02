
import java.util.Scanner;

public class LargestOddString {
    


    public static void main(String[] args) {
        String xm = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //scanner:op.next:system.fold\f
        
        String[] time = s.split(":");
        // time[time.length - 1]=time[time.length - 1]+" ";
        //System.out.println(time[time.length - 1].subSequence(time[time.length - 1].length()-2,time[time.length - 1].length()));
        
        if (time[time.length - 1].subSequence(time[time.length - 1].length()-2,time[time.length - 1].length()).equals("PM")) {
            int h = Integer.parseInt(time[0]) + 12;
            time[0] = Integer.toString(h);
        }
        
        time[time.length - 1] = time[time.length - 1].substring(0, time[time.length - 1].length()- 2);
        //System.out.println(time[time.length - 1] );
        
        for (int i = 0; i < time.length - 1; i++) {
            xm += time[i] + ":";
        }
        xm += time[time.length - 1];
        
        System.out.println(xm);
    }
}
    

