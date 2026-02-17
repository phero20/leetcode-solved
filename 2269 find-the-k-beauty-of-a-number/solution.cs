public class Solution {
    public int DivisorSubstrings(int num, int k) {
        string st = num.ToString();

        int count=0;

        for(int i=0;i<=st.Length-k;i++) {
            string sub = st.Substring(i,k);
            int v=int.Parse(sub);

            if(v!=0 && num%v==0) count++;
        }
        return count;
    }
}
