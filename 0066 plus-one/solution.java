class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from the rightmost digit to the left
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return
            // No carry-over needed for subsequent digits.
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // We're done, return the modified array
            } 
            // If the current digit is 9, set it to 0 and carry-over 1 to the next digit
            else {
                digits[i] = 0;
            }
        }

        // If we reach this point, it means all digits were 9 (e.g., [9,9,9])
        // We need a new array with an additional leading 1.
        // For [9,9,9] -> [1,0,0,0]
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The first digit becomes 1
        // The rest of the newDigits array will be 0 by default (Java initialization)
        
        return newDigits;
    }
}
