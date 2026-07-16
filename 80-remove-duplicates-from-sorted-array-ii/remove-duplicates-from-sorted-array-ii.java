class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n <= 2) return n;

        int pos = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[pos - 2]) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        return pos;
    }
}
