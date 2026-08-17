class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        Map<Integer, Integer> counts = new HashMap<>();
        int a = 0, b = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counts.put(grid[i][j], counts.getOrDefault(grid[i][j], 0) + 1);
                if (counts.get(grid[i][j]) == 2) {
                    a = grid[i][j];
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (!counts.containsKey(i)) {
                b = i;
                break;
            }
        }
        return new int[]{a, b};
    }
}