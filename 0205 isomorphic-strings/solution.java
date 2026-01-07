class Solution {
    public boolean isIsomorphic(String s, String t) {
     if(s.length()!=t.length()) return false;
     int[] a=new int[256];
     int[] b=new int[256];

     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        char d=t.charAt(i);
        if(a[c]!=b[d]) return false;
        a[c]=i+1;
        b[d]=i+1;
     }
     return true;
    
    }
}
