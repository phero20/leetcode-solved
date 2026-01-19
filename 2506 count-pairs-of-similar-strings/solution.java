class Solution {
    public int similarPairs(String[] words) {
        int l=0;
        for(int i=0;i<words.length;i++){
            Set<Character> s = new HashSet<>();
             for(char c:words[i].toCharArray()) s.add(c);
            for(int j=i+1;j<words.length;j++){
              Set<Character> jset = new HashSet<>();
                for(char c:words[j].toCharArray()) jset.add(c);
                if(s.equals(jset)) l++;
            }
            
            
        }
        return l;
    }
}
