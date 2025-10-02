public class ArrayMed11 {
    public static void setZeroMatrix(int[][] ar, int r, int c) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == r || j == c)
                    System.out.print("0 ");
                else
                    System.out.print(ar[i][j] + " ");
            }
            Sys
        }
    }

    public static void main(String[] args) {
        int[][] ar = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        boolean foundZero = false;
        int row = -1, col = -1;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == 0) {
                    row = i;
                    col = j;
                    foundZero = true;
                    break;
                }
            }
            if (foundZero) break;
        }
        if (foundZero) setZeroMatrix(ar, row, col);
    }
}