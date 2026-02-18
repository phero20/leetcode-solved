class Solution {
    public int romanToInt(String s) {
        int arr[]=new int[126];
        arr['I']=1;
        arr['V']=5;
        arr['X']=10;
        arr['L']=50;
        arr['C']=100;
        arr['D']=500;
        arr['M']=1000;
        int ans =0;
        for(int i=0;i<s.length();i++) {
            int v=arr[s.charAt(i)];
            if(i+1<s.length() && v<arr[s.charAt(i+1)]) ans-=v;
            else ans+=v;
        }
        return ans;
    }
}
