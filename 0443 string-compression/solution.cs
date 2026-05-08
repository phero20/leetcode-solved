public class Solution {
    public int Compress(char[] chars) {
        int write=0,c=1;
        for(int i=1;i<=chars.Length;i++) {
            if(i==chars.Length || chars[i]!=chars[i-1]) {
                chars[write++]=chars[i-1];
                if(c>1) {
                    foreach (char cc in c.ToString().ToCharArray())
                    {
                        chars[write++] = cc;
                    }
                }
                c=1;
            } else c++;
        }  
        return write;
    }
}
