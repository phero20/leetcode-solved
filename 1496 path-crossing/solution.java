class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> set = new HashSet<>();
        int x=0,y=0;
        set.add(0);
        for(char c:path.toCharArray()) {
            if(c=='N') y++;
            else if(c=='S') y--;
            else  if(c=='E') x++;
            else x--;
            if(!set.add(x*2001+y)) return true; 
        }
        return false;
    }
}
