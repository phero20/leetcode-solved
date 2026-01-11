class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()) map.merge(c,1,Integer::sum);
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        
        maxHeap.addAll(map.entrySet());
        StringBuilder st = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();

            for(int i=0;i<entry.getValue();i++)
              st.append(entry.getKey());
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        return st.toString();

    }
}
