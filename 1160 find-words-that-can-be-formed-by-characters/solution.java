class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char c:chars.toCharArray()) freq[c-'a']++;
        int sum=0;
        for(String word:words){
           if(canForm(word,freq)) sum+=word.length();
        }
        return sum;
    }
    boolean canForm(String word,int freq[]){
        int[] cf=new int[26];
        for(int i=0;i<word.length();i++){
            int x=word.charAt(i)-'a';
            cf[x]++;
            if(cf[x]>freq[x]) return false;
        }
        return true; 
    }
}
