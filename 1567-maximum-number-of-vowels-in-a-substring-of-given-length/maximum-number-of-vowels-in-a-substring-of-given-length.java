class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
                count++;
            }
        }

        int maxCount = count;
        for (int i = k; i < s.length(); i++) {

            char ad = s.charAt(i);
            char re = s.charAt(i - k);

            if (ad == 'a' || ad == 'e' || ad == 'i' ||ad == 'o' || ad == 'u') count++;

            if (re == 'a' || re == 'e' ||re == 'i' || re == 'o' ||re == 'u')  count--;

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}