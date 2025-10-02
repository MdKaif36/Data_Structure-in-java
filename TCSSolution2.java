import java.util.Scanner;

public class TCSSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the binary string
        String binaryString = sc.nextLine();

        // Read the worth array
        int n = binaryString.length();
        int[] worth = new int[n];
        for (int i = 0; i < n; i++) {
            worth[i] = sc.nextInt();
        }

        // Initialize variables
        int sumToRemove = 0; // Total worth of characters to remove
        int lastChar = -1; // Track the last character in alternating sequence
        int lastWorth = 0; // Track the worth of the last character
        int maxWorthIndex = -1; // Index of the character contributing max worth

        // Process the binary string
        for (int i = 0; i < n; i++) {
            int currentChar = binaryString.charAt(i) - '0'; // Convert char to int

            if (currentChar == lastChar) {
                // If character repeats, decide which one to keep
                if (worth[i] > lastWorth) {
                    // Remove the last character from alternating sequence
                    sumToRemove += lastWorth;
                    lastWorth = worth[i];
                } else {
                    // Remove the current character
                    sumToRemove += worth[i];
                }
            } else {
                // Add the character to the alternating sequence
                lastChar = currentChar;
                lastWorth = worth[i];
            }
        }

        // Output the result
        System.out.println(sumToRemove);

        sc.close();
    }
}
