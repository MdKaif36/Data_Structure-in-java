import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 13, 17, 19, 23, 31, 37};
        int x = 20;
        System.out.println("In this code you can find Upper bound and Lower bound of element: ");
        System.out.println("Press 1 for Upper bound ");
        System.out.println("Press 2 for Lower bound ");
        System.out.println("Enter the button what you want 1 or 2 ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1: {
                int ans = upperbound(arr, x);
                System.out.println("Upper bound of " + x + " is " + arr[ans]);
                break; // Add break statement
            }
            case 2: {
                int ans = lowerbound(arr, x);
                System.out.println("Lower bound of " + x + " is " + arr[ans]);
                break; // Add break statement
            }
            default: {
                System.out.println("Invalid option choose only 1 or 2 ");
                break; // Add break statement
            }
        }
    }

    // function upper bound
    //{1, 5, 7, 13, 17, 19, 23, 31, 37}
    public static int upperbound(int ar[], int find) {
        int low = 0, high = ar.length - 1;
        int location = -1;
        while (low <= high) {
            int medium = (low + high) / 2;
            if (ar[medium] >= find) {
                high = medium - 1;
                location = medium;
            } else {
                low = medium + 1;
            }
        }
        return location;
    }

    // function lower bound
    //{1, 5, 7, 13, 17, 19, 23, 31, 37}
    public static int lowerbound(int ar[], int find) {
        int low = 0, high = ar.length - 1;
        int location = -1;
        while (low <= high) {
            int medium = (low + high) / 2;
            if (ar[medium] < find) {
                low = medium + 1;
                location = medium;
            } else {
                high = medium - 1;
            }
        }
        return location;
    }
}