import java.util.*;

class Bid {
    int userId;
    int amount;

    public Bid(int userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }
}

class AuctionSystem {
    Map<Integer, Map<Integer, Integer>> umap;
    Map<Integer, TreeSet<Bid>> lb;

    public AuctionSystem() {
        umap = new HashMap<>();
        lb = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        umap.putIfAbsent(itemId, new HashMap<>());
        lb.putIfAbsent(itemId, new TreeSet<>((a, b) -> {
            if (a.amount != b.amount) return b.amount - a.amount;
            return b.userId - a.userId;
        }));

        Map<Integer, Integer> iU = umap.get(itemId);
        TreeSet<Bid> iL = lb.get(itemId);

        if(iU.containsKey(userId)) {
            int oA = iU.get(userId);
            iL.remove(new Bid(userId, oA));
        }

        iU.put(userId, bidAmount);
        iL.add(new Bid(userId, bidAmount));
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        Map<Integer, Integer> iU = umap.get(itemId);
        TreeSet<Bid> iL = lb.get(itemId);
        
        int oA = iU.get(userId);
        iL.remove(new Bid(userId, oA));
        
        iU.put(userId, newAmount);
        iL.add(new Bid(userId, newAmount));
    }
    
    public void removeBid(int userId, int itemId) {
        Map<Integer, Integer> iU = umap.get(itemId);
        TreeSet<Bid> iL = lb.get(itemId);
        
        int A = iU.remove(userId);
        iL.remove(new Bid(userId, A));
    }
    
    public int getHighestBidder(int itemId) {
        if(!lb.containsKey(itemId) || lb.get(itemId).isEmpty()) {
            return -1;
        }
        return lb.get(itemId).first().userId;
    }
}
