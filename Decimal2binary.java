import java.util.Scanner;
public class Decimal2binary {
    public static void main(String[] args) {
        StringBuilder newstr=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        System.out.println("Decimal to Binary - Press button 1");
        System.out.println("Binary to Decimal - Press button 2");
        System.out.println("Enter the button ");
        int option=sc.nextInt();
        switch(option){
            case 1:{
                System.out.println("enter the number: ");
                int num=sc.nextInt();
                int n=num;
                    while(num!=1){
                        if(num%2==0){
                            newstr.append(0);
                        }
                        else{
                            newstr.append(1);
                        }
                        num=num/2;
                        if(num==1){
                            newstr.append(1);
                        }
                    }
                    System.out.println("Binary value of "+n+" ");
                    newstr.reverse();
                    System.out.println(newstr.toString());
    
            }
                break;
                case 2:{
                    System.out.println("Enter the binary number string: ");
                    String str=sc.next();    //1101
                    double total=0;
                    for(int i=str.length()-1;i>=0;i--){
                        char ch=str.charAt(i);
                        int num=Character.getNumericValue(ch);
                        total=total+num*Math.pow(2,(str.length()-1)-i);

                        
                    }
                    System.out.println("Binary to al: "+total);

                }
                break;
                default:{
                    System.out.println("choose only 1 and 2 ");
                }
                break;
            
            

        }

    }
}
