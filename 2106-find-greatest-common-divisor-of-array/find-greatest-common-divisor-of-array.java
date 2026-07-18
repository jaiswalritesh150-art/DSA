import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums); 
        int min = nums[0];
        int max = nums[nums.length - 1];
        while (max % min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }
        return min;
    }
}
