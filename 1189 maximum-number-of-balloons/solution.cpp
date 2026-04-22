class Solution {
public:
    int maxNumberOfBalloons(string text) {
        vector<int> c(26,0);
        int ans = 100;
        for(int i=0;i<text.size();i++) c[text[i]-'a']++;
        int b = c['b'-'a'];
        int a = c['a'-'a'];
        int l = c['l'-'a']/2;
        int o = c['o'-'a']/2;
        int n = c['n'-'a'];

         return min({b,a,l,o,n});
    }
};
