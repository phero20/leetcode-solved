class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        int z=0,o=0;
        for(int i:students) {
            if(i==0) z++;
            else o++;
        }
        for(int s:sandwiches) {
            if(s==0) {
                if(z==0) return o;
                z--;
            } else {
                if(o==0) return z;
                o--;
            }
        }
        return 0;
    }
};
