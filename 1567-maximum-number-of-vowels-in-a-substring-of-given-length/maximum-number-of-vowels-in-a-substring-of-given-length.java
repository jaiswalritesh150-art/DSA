class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);

            if (isVowel(c)) {
                count++;
            }
        }

        int maxCount = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {

            char addChar = s.charAt(i);
            char removeChar = s.charAt(i - k);

            if (isVowel(addChar)) {
                count++;
            }

            if (isVowel(removeChar)) {
                count--;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u';
    }
}