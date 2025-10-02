// find numbr who appear odd no times
public class bit12 {
    public static void main(String[] args) {
        System.out.println("the number which appear once in ar[]: ");
        int[] ar={1,7,5,7,5,4,7,4};
        int count=0,appear=0;
        for(int i=0;i<ar.length;i++){
            count=0;
            appear=0;
            for(int j=0;j<ar.length;j++){
                if(ar[i]==ar[j]){
                    count++;
                }
            }
            for(int k=0;k<=i;k++){
                if(ar[i]==ar[k]){
                    appear++;
                }
            }
            if(count%2!=0&&appear==1){
                System.out.print(ar[i]+",");
            }
        }
    }
    
}
