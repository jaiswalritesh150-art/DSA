class Solution {
    public String removeDuplicates(String s) {
        char[] arr = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (top >= 0 && arr[top] == ch) {
                top--;
            } else {
                arr[++top] = ch;
            }
        }
        return new String(arr, 0, top + 1);
    }
}