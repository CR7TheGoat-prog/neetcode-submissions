class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();

        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                cnt++;
            }
            hmap.put(nums[i], 1);
        }
        return cnt > 0;
    }
}