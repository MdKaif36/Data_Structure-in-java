import java.util.Scanner;

public class time {

    public static void main(String[] args) {
        String xm = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        String[] time = s.split(":");
        
        if(time[0].equals("12") && time[time.length - 1].substring(time[time.length - 1].length()-2, time[time.length - 1].length()).equals("AM")){
            time[0]="00";
        }
        
        else if (time[time.length - 1].substring(time[time.length - 1].length()-2, time[time.length - 1].length()).equals("PM")) {
            if(!time[0].equals("12")){
                int h = Integer.parseInt(time[0]) + 12;
                time[0] = Integer.toString(h);
            }
        }
        
        time[time.length - 1] = time[time.length - 1].substring(0, time[time.length - 1].length()- 2);
        
        for (int i = 0; i < time.length - 1; i++) {
            xm += time[i] + ":";
        }
        xm += time[time.length - 1];
        
        System.out.println(xm);
    }
}