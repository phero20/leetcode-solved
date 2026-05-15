class Solution {
    public int minAddToMakeValid(String s) {
        int bl = 0, in = 0;
        for(char c:s.toCharArray()) {
            if(c=='(') {
                in++;
            } else {
                if(in > 0) in--;
                else bl++; 
            }
        }
        return bl + in;
    }
}
