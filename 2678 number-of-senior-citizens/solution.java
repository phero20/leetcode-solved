class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(String s:details)
            if(Integer.parseInt(s.substring(11,s.length()-2)) > 60) ans++;
        return ans;
    }
}
