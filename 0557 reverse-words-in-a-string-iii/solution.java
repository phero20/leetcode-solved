class Solution {
    public String reverseWords(String s) {
        int l =0;
        char[] st = s.toCharArray();
        for(int i=0;i<st.length;i++) {
            if(st[i]==' ') {
                rev(st,l,i-1);
                l=i+1;
            }
        }
        rev(st,l,st.length-1);
        return new String(st);
    }
    private void rev(char[] st,int l,int r) {
        while(l<r) {
            char c = st[l];
            st[l++] = st[r];
            st[r--] = c;
        }
    }
}
