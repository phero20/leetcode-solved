class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int dig = n%10;
            map.put(dig,map.getOrDefault(dig,0)+1);
            n/=10;
        }
        int sum=0;
        for(int i:map.keySet()) {
            sum+=map.get(i)*i;
        }
        return sum;
    }
}
