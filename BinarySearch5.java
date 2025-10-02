// find floor and ceiling of number using binary seach algo
public class BinarySearch5 {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 4, 7, 8, 10 };
        // 0 1 2 3 4 5
        int num = 9;
        int low = 0, high = arr.length - 1;
        while (low < high) {
            int medium = (low + high) / 2;
            if (arr[medium] < num && arr[medium + 1] > num) {
                System.out.println("floor of " + num + " is :" + arr[medium]);
                System.out.println("Ceiling of " + num + " is :" + arr[medium + 1]);
                break;
            }
            if (arr[medium] == num) {
                System.out.println("floor and ceiling of " + num + " is :" + arr[medium]);
                break;
            } else if (arr[medium] > num) {
                high = medium - 1;
            } else {
                low = medium + 1;
            }
        }
    }
}
