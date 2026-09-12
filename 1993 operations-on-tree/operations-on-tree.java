class LockingTree {
    int[] map,parent;
    List<Integer>[] ch;
    public LockingTree(int[] parent) {
        this.parent = parent;
        int n = parent.length;
        map = new int[n];
        ch = new ArrayList[n];
        for(int i=0;i<n;i++) ch[i] = new ArrayList<>();
        for(int i=1;i<n;i++) ch[parent[i]].add(i);
    }
    
    public boolean lock(int num, int user) {
        if(map[num] != 0) return false;
        map[num] = user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(map[num] != user) return false;
        map[num] = 0;
        return true;
    }
    
    public boolean upgrade(int num, int user) {
        if(map[num] != 0) return false;
        int p = parent[num];
        while(p!=-1) {
            if(map[p] != 0) return false;
            p = parent[p];
        }
        if(!check(num)) return false;
        unlock(num);
        map[num] = user;
        return true;
    }

    private boolean check(int num) {
        for(int n:ch[num]) {
            if(map[n] != 0 || check(n)) return true;
        }
        return false;
    }

    private void unlock(int num) {
        for(int n:ch[num]) {
            map[n] = 0;
            unlock(n);
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */