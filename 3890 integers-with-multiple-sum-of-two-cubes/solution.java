class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        int limit = (int) Math.pow(n, 1.0/3.0) + 1;
        for(int i=1;i<=limit;i++) {
            long a = i*i*i;
            if(a>=n) break;
            for(int b = i;b<=limit;b++) {
                long sum = a + b*b*b;
                if(sum > n) break;
                map.put((int)sum,map.getOrDefault((int)sum,0)+1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i:map.keySet()) {
            if(map.get(i)>=2) {
                ans.add(i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
