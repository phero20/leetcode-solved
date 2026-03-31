
class EventManager {
    TreeSet<int[]> dynamicSortedSet;
    HashMap<Integer, int[]> idToEventMap;

    public EventManager(int[][] events) {
        idToEventMap = new HashMap<>();
        dynamicSortedSet = new TreeSet<>((a, b) -> {
            if (a[1] != b[1]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]);     
        });

        for (int[] event : events) {
            idToEventMap.put(event[0], event);
            dynamicSortedSet.add(event);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        int[] event = idToEventMap.get(eventId);
        if (event != null) {
            dynamicSortedSet.remove(event);
            event[1] = newPriority;
            
            dynamicSortedSet.add(event);
        }
    }
    
    public int pollHighest() { 
        int[] topEvent = dynamicSortedSet.pollFirst();
        if (topEvent != null) {
            idToEventMap.remove(topEvent[0]);
            return topEvent[0]; 
        }   
        return -1; 
}
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
