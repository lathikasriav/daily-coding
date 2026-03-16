class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse from the end
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;  // add 1
                return digits;    // done
            }
            digits[i] = 0; // carry over
        }
        
        // If all digits were 9, we need a new array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // e.g., 999 + 1 = 1000
        return newDigits;
    }
}