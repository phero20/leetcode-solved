class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> l = new ArrayList<>();
        for (String c : words) {
            if (c.length() == pattern.length())
                if (isp(pattern, c))
                    l.add(c);
        }

        return l;
    }

    private boolean isp(String s1, String s2) {
        Set<Character> set = new HashSet<>();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } 
                else {
                    if (set.contains(c2))
                        return false;
                    map.put(c1, c2);
                    set.add(c2);
                }
        }
        return true;
    }
}
