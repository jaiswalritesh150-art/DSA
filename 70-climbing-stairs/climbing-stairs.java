class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int oneStepBefore = 2;
        int twoStepsBefore = 1; 
        int result = 0;
        for (int i = 3; i <= n; i++) {
            result = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = result;
        }
        return result;
    }
}
