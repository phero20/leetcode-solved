class Solution {
    public int secondHighest(String s) {
        int fmax = -1, smax = -1;
        for (char i : s.toCharArray()) {
            if (Character.isDigit(i)) {
                int num = (int) (i) - 48;
                if (num > fmax) {
                    smax = fmax;
                    fmax = num;
                } else if (num < fmax && num > smax) {
                    smax = num;
                }
            }

        }
        return smax;
    }
}
