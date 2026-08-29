class Solution {
    public int maxArea(int[] heights) {
        int i = 0, j = heights.length - 1;
        int res = 0;
        while (i < j) {
            res = Math.max(res, Math.min(heights[j],heights[i]) * (j - i));
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
