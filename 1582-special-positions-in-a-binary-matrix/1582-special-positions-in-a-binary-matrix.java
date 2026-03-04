class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] rowSums = new int[m];
        int[] colSums = new int[n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                rowSums[i] += mat[i][j];
                colSums[j] += mat[i][j];
            }

        int count = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 1 && rowSums[i] == 1 && colSums[j] == 1)
                    count++;

        return count;
    }
}