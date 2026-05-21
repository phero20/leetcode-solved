class Solution {
public:
    int climbStairs(int n) {
        if(n <=3) return n;
        int f=2,s=3;
        for(int i=4;i<=n;i++) {
            int t = f+s;
            f=s;
            s=t;
        }
        return s;
    }
};
