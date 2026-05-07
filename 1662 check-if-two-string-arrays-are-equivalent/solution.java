class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length, n = word2.length;
        int i = 0, j = 0;    
        int ii = 0, jj = 0;  
        while (i < m && j < n) {
            if (word1[i].charAt(ii) != word2[j].charAt(jj)) return false;
            if (ii == word1[i].length() - 1) {
                ii = 0;
                i++;
            } else {
                ii++;
            }
            if (jj == word2[j].length() - 1) {
                jj = 0;
                j++;
            } else {
                jj++;
            }
        }
        return i == m && j == n;
    }
}

