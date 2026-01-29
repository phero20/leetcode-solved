class Solution {
    public String customSortString(String order, String s) {
        int[] arr=new int[26];
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()) arr[c-'a']++;
        for(char c:order.toCharArray()){
            while(arr[c-'a']>0){
                res.append(c);
                arr[c-'a']--;
            }
        }
        for(int i=0;i<26;i++) {
            while(arr[i]>0){
                res.append((char) (i+'a'));
                arr[i]--;
            }
        } 
        return res.toString();
    }
}
