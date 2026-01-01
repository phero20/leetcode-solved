class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add one and return
                return digits;
            }
            digits[i] = 0;     // set to 0 and carry over
        }

        // If we reach here, all digits were 9 (e.g., 999 -> 1000)
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
