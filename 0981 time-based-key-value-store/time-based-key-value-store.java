class Pair {
    String value;
    int time;
    Pair(String value,int time) {
        this.value = value;
        this.time = time;
    }
}

class TimeMap {
    Map<String,List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)) {
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> nums = map.get(key);
        int l = 0,r = nums.size()-1;
        String ans = "";
        while(l<=r) {
            int mid = l+(r-l)/2;
            if(nums.get(mid).time <= timestamp) {
                ans = nums.get(mid).value;
                l=mid+1;
            } else {
                r=mid-1;
            }
        }
        return ans;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */