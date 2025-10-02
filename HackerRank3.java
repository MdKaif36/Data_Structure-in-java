import java.util.Scanner;
class HackerRank3{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("entre the time 12");
        String time12=sc.nextLine();
        //System.out.println(time12);
        
        String hourPart = time12.substring(0, 2);
        System.out.println(hourPart);
        String midPart = time12.substring(2, time12.length() - 2);
        System.out.println(midPart);
        String ampm = time12.substring(time12.length() - 2,time12.length());
        System.out.println(ampm);
        String time=convert(midPart, hourPart,ampm);
        System.out.println(time);
        
    }
    
    public static String convert(String mid,String hour,String AMPM){
        int hh=Integer.parseInt(hour);
        StringBuilder time24=new StringBuilder();
        
        if(AMPM.equals("PM")&& hh <12){
            hh+=12;
        }
        else if(AMPM.equals("AM")&&hh==12){
            hh=00;
        }
        else if(AMPM.equals("PM")&&hh==12){
            hh=12;
        }
        time24.append(String.format("%02d", hh));
        time24.append(mid);
        return time24.toString();
    }
    
}

