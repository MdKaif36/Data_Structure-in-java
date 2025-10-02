import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;



public class tcs3{

    static class Cell {
        int row, col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read matrix dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];

        // Read the matrix
        System.out.println("enter matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read the target block color code
        System.out.println("target");
        int targetColor = sc.nextInt();

        // Determine blocks to be removed
        int blocksToRemove = calculateBlocksToRemove(matrix, N, M, targetColor);

        // Print result
        System.out.println(blocksToRemove);

        sc.close();
    }

    private static int calculateBlocksToRemove(int[][] matrix, int N, int M, int targetColor) {
        // Mark visited cells
        boolean[][] visited = new boolean[N][M];

        // Track all blocks and their positions
        Map<Integer, List<Cell>> blockMap = new HashMap<>();

        // Identify all blocks and their cells
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) {
                    int color = matrix[i][j];
                    List<Cell> cells = new ArrayList<>();
                    dfs(matrix, visited, N, M, i, j, color, cells);
                    blockMap.put(color, cells);
                }
            }
        }

        // Identify the order of blocks to remove
        Set<Integer> blocksToRemove = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(targetColor);

        while (!queue.isEmpty()) {
            int currentColor = queue.poll();
            blocksToRemove.add(currentColor);

            // Simulate gravity to check affected blocks
            List<Cell> currentCells = blockMap.get(currentColor);
            for (Cell cell : currentCells) {
                int rowBelow = cell.row + 1;
                if (rowBelow < N && !blocksToRemove.contains(matrix[rowBelow][cell.col])) {
                    queue.add(matrix[rowBelow][cell.col]);
                }
            }
        }

        // Return the total count of blocks to remove
        return blocksToRemove.size();
    }

    private static void dfs(int[][] matrix, boolean[][] visited, int N, int M, int row, int col, int color, List<Cell> cells) {
        // Base case: Out of bounds or already visited or different color
        if (row < 0 || col < 0 || row >= N || col >= M || visited[row][col] || matrix[row][col] != color) {
            return;
        }

        // Mark as visited
        visited[row][col] = true;
        cells.add(new Cell(row, col));

        // Explore neighbors
        dfs(matrix, visited, N, M, row - 1, col, color, cells); // Up
        dfs(matrix, visited, N, M, row + 1, col, color, cells); // Down
        dfs(matrix, visited, N, M, row, col - 1, color, cells); // Left
        dfs(matrix, visited, N, M, row, col + 1, color, cells); // Right
    }
}
