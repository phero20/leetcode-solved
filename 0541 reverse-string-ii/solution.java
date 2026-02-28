class Solution {
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int i=0;
        while(i<ch.length) {
            rev(ch,i,Math.min(i+k-1,ch.length-1));
            i+=2*k;
        }
        return new String(ch);
    }
    public void rev(char[] ch,int s,int e){
        while(s<e){
            char temp=ch[s];
            ch[s++]=ch[e];
            ch[e--]=temp;
        }
    }
}
