import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long winsum = 0;
        long maxsum = 0;

        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            winsum += nums[i];
        }

        if (map.size() == k) {
            maxsum = winsum;
        }

        for (int i = k; i < nums.length; i++) {

            int old = nums[i - k];

            map.put(old, map.get(old) - 1);

            if (map.get(old) == 0) {
                map.remove(old);
            }

            winsum = winsum - old + nums[i];

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if (map.size() == k) {
                maxsum = Math.max(maxsum, winsum);
            }
        }
        return maxsum;
    }
}