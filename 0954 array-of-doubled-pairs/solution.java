// class Solution {
//     public boolean canReorderDoubled(int[] arr) {
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i:arr) map.merge(i,1,Integer::sum);
//         Arrays.sort(arr,(a,b)->Integer.compare(Math.abs(a),Math.abs(b)));
//         for(int i:arr) {
//             while(map.getOrDefault(i,0)>0) {
//                 if(map.getOrDefault(2*i,0)>0) {
//                     map.put(i,map.get(i)-1);
//                     map.put(i*2,map.get(i*2)-1);
//                 }
//                 else return false;
//             }
//              if (map.getOrDefault(i, 0) == 0) {
//                 map.remove(i);
//             }
//             if (map.getOrDefault(2 * i, 0) == 0) {
//                 map.remove(2 * i);
//             }
//         }
//         return true;
//     }
// }


import java.util.*;

class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
        map.put(i,map.getOrDefault(i,0)+1); 
        List<Integer> ar = new ArrayList<>(map.keySet());
        Collections.sort(ar, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));

        for (int k : ar) {
           int c = map.get(k);
           if(c==0) continue;
           int pa = map.getOrDefault(2*k,0);
           if(c>pa) return false;
           map.put(2*k,pa-c);
        }
        return true;
    }
}
