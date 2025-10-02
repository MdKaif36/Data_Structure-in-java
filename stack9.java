// summ of subarrays minimums

public class stack9 {
    public static void main(String[] args) {
        int ar[] = {3, 1, 2, 4}; // length = 4

        int min=0,sum=0;
        // Loop through each starting point of the subarray
        for (int i = 0; i < ar.length; i++) {
            // Loop through each ending point of the subarray
            for (int j = i; j < ar.length; j++) {
                min=ar[i];
                // Print the subarray from index i to j
                for (int k = i; k <= j; k++) {
                    //System.out.print(ar[k] + " ");
                    min=Math.min(min,ar[k]);

                }
                sum=sum+min;
                //System.out.println(); // Move to the next line after printing a subarray
            }
        }
        System.out.println(" summ of subarrays minimums: "+sum);
    }
}