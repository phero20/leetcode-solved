class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int i = 0;
        while(i<s1.length && i<s2.length && s1[i].equals(s2[i])) i++;
        int j1 = s1.length-1, j2 = s2.length-1;
        while(j1>=i && j2>=i && s1[j1].equals(s2[j2])) {
            j1--;
            j2--;
        }
        return j1 < i || j2 < i;
    }
}
