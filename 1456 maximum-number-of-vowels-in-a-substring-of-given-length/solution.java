class Solution {
    public int maxVowels(String s, int k) {
        boolean vowel[] = new boolean[126];
        vowel['a']= vowel['e']= vowel['i']= vowel['o']= vowel['u']=true;
        int c=0,ma=0;
        for(int i=0;i<s.length();i++) {
            char curr=s.charAt(i);
            if(vowel[curr]) c++;
            if(i>=k && vowel[s.charAt(i-k)]) c--;
            ma=Math.max(ma,c);
        }
        return ma;
    }
}
