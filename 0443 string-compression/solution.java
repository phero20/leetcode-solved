class Solution {
    public int compress(char[] chars) {
        int write=0,c=1;
        for(int i=1;i<=chars.length;i++) {
            if(i==chars.length || chars[i]!=chars[i-1]) {
                chars[write++]=chars[i-1];
                if(c>1) {
                    for(char cc : Integer.toString(c).toCharArray()) {
                        chars[write++] = cc;
                    }
                }
                c=1;
            } else c++;
        }  
           return write;
    }
}
