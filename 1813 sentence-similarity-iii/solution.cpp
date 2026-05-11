class Solution {
public:
    bool areSentencesSimilar(string sentence1, string sentence2) {
        vector<string> a, b;
        stringstream ss1(sentence1), ss2(sentence2);
        string word;
        while (ss1 >> word) a.push_back(word);
        while (ss2 >> word) b.push_back(word);

        int i = 0;
        while (i < a.size() && i < b.size() && a[i] == b[i]) i++;

        int j1 = (int)a.size() - 1, j2 = (int)b.size() - 1;
        while (j1 >= i && j2 >= i && a[j1] == b[j2]) {
            j1--; j2--;
        }
        return j1 < i || j2 < i;
    }
};

