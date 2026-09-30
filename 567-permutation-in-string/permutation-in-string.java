class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] count = new int[26];
        int[] window = new int[26];

        if (s1.length() > s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            window[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(count, window)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); i++) {

            window[s2.charAt(i - s1.length()) - 'a']--;
            window[s2.charAt(i) - 'a']++;

            if (Arrays.equals(count, window)) {
                return true;
            }
        }
        return false;
    }
}