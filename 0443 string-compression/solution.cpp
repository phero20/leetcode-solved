class Solution {
public:
    int compress(vector<char>& chars) {
        int write=0,c=1;
        for(int i=1;i<=chars.size();i++) {
            if(i==chars.size() || chars[i]!=chars[i-1]) {
                chars[write++]=chars[i-1];
                if(c>1) {
                    string cnt = to_string(c);
                    for (char c : cnt) {
                        chars[write++] = c;
                    }
                }
                c=1;
            } else c++;
        }  
        return write;
    }
};
