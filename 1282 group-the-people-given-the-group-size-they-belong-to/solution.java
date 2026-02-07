class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
    //    Map<Integer,List<Integer>> map = new HashMap<>();
    //     List<List<Integer>> l1 = new ArrayList<>();
    //     for(int i=0;i<groupSizes.length;i++) {
    //         int key = groupSizes[i];
    //         map.putIfAbsent(key, new ArrayList<>());
    //         map.get(key).add(i);
    //     }
    //     for(int i:map.keySet()) {
    //          List<Integer> l = new ArrayList<>();
    //         for(int j:map.get(i)){
    //             l.add(j);
    //              if(l.size()==i) {
    //                  l1.add(new ArrayList<>(l));
    //                  l.clear();
    //              }
    //         }
    //     }
    //     return l1;
    // }
    int n=groupSizes.length;
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer>[] l=new List[n+1];

    for(int i=0;i<n;i++) {
        int s=groupSizes[i];

        if(l[s]==null) l[s]=new ArrayList<>();
        l[s].add(i);

        if(l[s].size()==s) {
            ans.add(l[s]);
            l[s]=new ArrayList<>();
        }
    }




return ans;


    }
}
