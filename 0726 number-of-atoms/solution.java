class Solution {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> st = new Stack<>();
        st.push(new HashMap<>());
        int i = 0, n = formula.length();
        while(i < n) {
            char c = formula.charAt(i);
            if(c=='(') {
                st.push(new HashMap<>());
                i++;
            } else if(c==')') {
                i++;
                int srt = i;
                while(i<n && Character.isDigit(formula.charAt(i))) i++;
                int mult = srt < i ? Integer.parseInt(formula.substring(srt,i)) : 1;
                Map<String, Integer> popped = st.pop();
                Map<String, Integer> top = st.peek();
                for(String at:popped.keySet()) {
                    top.put(at,top.getOrDefault(at,0) + popped.get(at)*mult);
                }
            } else {
                int srt = i++;
                while(i<n && Character.isLowerCase(formula.charAt(i))) i++;
                String atom = formula.substring(srt, i);
                srt = i;
                while(i<n && Character.isDigit(formula.charAt(i))) i++;
                int ct = srt < i ? Integer.parseInt(formula.substring(srt,i)) : 1;  
                Map<String, Integer> top = st.peek();
                top.put(atom, top.getOrDefault(atom, 0) + ct);
            }
        }
        Map<String, Integer> finalMap = st.pop();
        TreeMap<String, Integer> sorted = new TreeMap<>(finalMap);

        StringBuilder sb = new StringBuilder();
        for (String atom : sorted.keySet()) {
            sb.append(atom);
            int cnt = sorted.get(atom);
            if (cnt > 1) sb.append(cnt);
        }
        return sb.toString();
    }
}
