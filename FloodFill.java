public class FloodFill {
    private int newColor, srcColor;

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        newColor = color;
        srcColor = image[sr][sc];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (i == sr && j == sc && image[i][j] != newColor) {
                    dfs(i, j, image);
                }
            }
        }
        return image;
    }

    private void dfs(int i, int j, int[][] image) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length || image[i][j] != srcColor) {
            return;
        }

        image[i][j] = newColor;
        dfs(i - 1, j, image);
        dfs(i + 1, j, image);
        dfs(i, j - 1, image);
        dfs(i, j + 1, image);
    }
}
