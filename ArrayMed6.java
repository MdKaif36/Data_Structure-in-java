 //buy and sell stocks
public class ArrayMed6 {
    public static void main(String[] args) {
        int ar[] = {7,1,5,3,6,4};
        int minValue=ar[0],maxpro=0;
        int dayBuy=0,daySell=0;
        //buy a stocks
        //int minValue = Arrays.stream(ar).min().getAsInt();
        for(int i=0;i<ar.length;i++){
            minValue=Math.min(minValue,ar[i]);
            maxpro=Math.max(maxpro,ar[i]-minValue);
        }
        for(int i=0;i<ar.length;i++){
            if(ar[i]==minValue)
                dayBuy=i+1;
            if(ar[i]==maxpro+minValue)
                daySell=i+1;
        }
        System.out.println("buying a stock on a "+dayBuy+" day and sell "+daySell+" day");
        System.out.println("MAximum profit is "+maxpro);
    }
    
}
