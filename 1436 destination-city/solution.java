class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> s = new HashSet<>();
        for(List<String> l : paths) s.add(l.get(0));
        for(List<String> l:paths) {
            if(!s.contains(l.get(1))) return l.get(1);
        }
        return "";
    }
}
