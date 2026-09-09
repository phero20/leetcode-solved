class Twitter {
    static int time = 0;
    HashMap<Integer,Set<Integer>> fl;
    HashMap<Integer,List<Tweet>> tw;
    public Twitter() {
        fl = new HashMap<>();
        tw = new HashMap<>();
    }
    static class Tweet {
        int id,time;
        Tweet(int id,int time) {
            this.id = id;
            this.time = time;
        }
    }
    public void postTweet(int userId, int tweetId) {
        if(!tw.containsKey(userId)) {
            tw.put(userId,new ArrayList<>());
        }
        tw.get(userId).add(new Tweet(tweetId,time++));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);
        if(tw.containsKey(userId)) {
            pq.addAll(tw.get(userId));
        }
        if(fl.containsKey(userId)) {
            for(int fid : fl.get(userId)) {
                if(tw.containsKey(fid)) {
                    pq.addAll(tw.get(fid));
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        while(!pq.isEmpty() && count < 10) {
            ans.add(pq.poll().id);
            count++;
        }
        return ans;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!fl.containsKey(followerId)) {
            fl.put(followerId,new HashSet<>());
        }
        fl.get(followerId).add(followeeId);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(fl.containsKey(followerId)) {
            fl.get(followerId).remove(followeeId);
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */