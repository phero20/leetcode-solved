class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder r = new StringBuilder(s).reverse();
       String rs=r.toString();
       for(int i=0;i<s.length()-1;i++){
        String sub = s.substring(i,i+2);
        if(rs.contains(sub)) return true;
       }
       return false;
    }
}
