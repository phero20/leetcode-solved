class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
    //    Map<Integer, List<Integer>> map = new HashMap<>();
    //    for (int[] i : matches) 
    //      map.computeIfAbsent(i[0],key -> new ArrayList<>()).add(i[1]);
    // List<Integer> l1 = new ArrayList<>();
    // List<Integer> l2 = new ArrayList<>();
    // int arr[]=new int[500];
    //     for(List<Integer> i:map.values()) 
    //         for(int v:i) arr[v]++;
    //     for(int i=0;i<arr.length;i++) {
    //         if(arr[i]==1) l1.add(i);
    //         if(map.containsKey(i) && arr[i]==0) l2.add(i);
    //     }
    //     return List.of(l2,l1);



    List<Integer> l1 = new ArrayList<>();
    List<Integer> l2 = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    for(int[] i:matches) {
        set.add(i[0]);
        set.add(i[1]);
        map.put(i[1],map.getOrDefault(i[1],0)+1);
    }
    for(int i:set) {
        int l=map.getOrDefault(i,0);
        if(l==0) l1.add(i);
        else if(l==1) l2.add(i);
    }

    Collections.sort(l1);
Collections.sort(l2);
return List.of(l1, l2);

    }
}
