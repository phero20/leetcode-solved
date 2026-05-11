public class Solution {
    public bool AreSentencesSimilar(string sentence1, string sentence2) {
        string[] a = sentence1.Split(' ');
        string[] b = sentence2.Split(' ');

        int i = 0;
        while (i < a.Length && i < b.Length && a[i] == b[i]) i++;

        int j1 = a.Length - 1, j2 = b.Length - 1;
        while (j1 >= i && j2 >= i && a[j1] == b[j2]) {
            j1--; j2--;
        }
        return j1 < i || j2 < i;
    }
}

