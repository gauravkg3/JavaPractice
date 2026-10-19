package CodingShuttle.Backtracking;

public class KinghtsTourProblems {


    public static void main(String[] args) {
        int n = 5;
        int grid[][] = new int[n][n];

        boolean ans = knightsTourProblems(grid);

        System.out.println(ans);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean knightsTourProblems(int grid[][]) {  //Square maze a chess board
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = -1;
            }
        }

        return knightsTourProblemsHelper(grid, 0, 0, n, 1);
    }

    public static boolean knightsTourProblemsHelper(int grid[][], int currX, int currY, int n, int step) {
        grid[0][0] = 0;
        int moveX[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int moveY[] = {1, 2, 2, 1, -1, -2, -2, -1};

        if (step == n * n) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int nextX = currX + moveX[i];
            int nextY = currY + moveY[i];

            if (isValid(nextX, nextY, grid, n)) {

                grid[nextX][nextY] = step;

                boolean isTourCompleteByGoingThere = knightsTourProblemsHelper(grid, nextX, nextY, n, step + 1);

                if (isTourCompleteByGoingThere) {
                    return true;
                } else {
                    grid[nextX][nextY] = -1;
                }
            }

        }

        return false;
    }

    public static boolean isValid(int i, int j, int grid[][], int n) {
        if (i >= 0 && j >= 0 && i < n && j < n && grid[i][j] == -1) {
            return true;
        }
        return false;
    }
}
