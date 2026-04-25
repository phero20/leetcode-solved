class Solution {
    public boolean isCircularSentence(String s) {
        int n = s.length()-1;
        if(s.charAt(0)!=s.charAt(n)) return false;
        String[] arr = s.split(" ");
        for(int i=1;i<arr.length;i++) {
            if(arr[i].charAt(0)!=arr[i-1].charAt(arr[i-1].length()-1)) {
                return false;
            }
        }
        return true;
    }
}
