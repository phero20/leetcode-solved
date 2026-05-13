class Solution {
public:
    int calPoints(vector<string>& operations) {
        stack<int> st;
        int ans = 0;
        for(string s:operations) {
            if(s=="+") {
                int first = st.top(); st.pop();
                int second = st.top();
                int sum = first+second;
                st.push(first);
                st.push(sum);
                ans+=sum;
            } else if(s=="D") {
                int mul = 2*st.top();
                st.push(mul);
                ans+=mul;
            } else if(s=="C"){
                ans-=st.top();
                st.pop();
            } else {
                int num = stoi(s);
                st.push(num);
                ans+=num;
            }
        }
        return ans;
    }
};
