package CodingShuttle.Backtracking;

public class RateInMazeInSolution {
    public static void main(String[] args) {
        int matrix[][] = {
                {0, 1, 1, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {1, 0, 1, 1}
        };

        int n = matrix.length; //row
        int m = matrix[0].length;//col

        boolean visited[][] = new boolean[n][m];
        visited[0][0] = true;
        rateInMaze(0, 0, matrix, visited, n, m, "");


    }

    //DLRU
    public static void rateInMaze(int i, int j, int matrix[][], boolean visited[][], int n, int m, String path) {
        if (i == n - 1 && j == m - 1) {
            System.out.println(path);
            return;
        }


        if (isValid(i + 1, j, matrix, visited, n, m))//D
        {
            visited[i + 1][j] = true;
            rateInMaze(i + 1, j, matrix, visited, n, m, path + 'D');
            visited[i + 1][j] = false;
        }
        

        if (isValid(i, j - 1, matrix, visited, n, m))//L
        {
            visited[i][j - 1] = true;
            rateInMaze(i + 1, j, matrix, visited, n, m, path + 'L');
            visited[i][j - 1] = false;
        }
        if (isValid(i, j + 1, matrix, visited, n, m))//R
        {
            visited[i][j + 1] = true;
            rateInMaze(i, j + 1, matrix, visited, n, m, path + 'R');
            visited[i][j + 1] = false;
        }
        if (isValid(i - 1, j, matrix, visited, n, m))//U
        {
            visited[i - 1][j] = true;
            rateInMaze(i - 1, j, matrix, visited, n, m, path + 'U');
            visited[i - 1][j] = false;
        }

    }

    public static boolean isValid(int i, int j, int matrix[][], boolean visited[][], int n, int m) {
        if (i < n && j < m && i >= 0 && j >= 0 && matrix[i][j] == 1 && visited[i][j] == false) {
            return true;
        }
        return false;
    }
}
