class Solution {
    public String decodeString(String s) {
        Deque<StringBuilder> p = new ArrayDeque<>();
        Deque<Integer> st = new ArrayDeque<>();
        StringBuilder curr = new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray()) {
            if(Character.isDigit(ch)) {
                num = num*10 + (ch-'0');
            } else if(ch=='[') {
                p.push(curr);
                st.push(num);
                curr = new StringBuilder();
                num=0;
            } else if(ch==']') {
                int r=st.pop();
                StringBuilder prev = p.pop();
                for(int i=0;i<r;i++) {
                    prev.append(curr);
                }
                curr=prev;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
