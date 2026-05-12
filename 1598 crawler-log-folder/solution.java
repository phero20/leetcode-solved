class Solution {
    public int minOperations(String[] logs) {
        int[] st = new int[logs.length];
        int top = 0;
        for(String s:logs) {
            if(s.equals("./")) continue;
            else if(s.equals("../")) {
                if(top > 0) top--;
            } else {
                top++;
            }
        }
        return top;
    }
}
