class MyHashSet {
    private set:boolean[];
    constructor() {
        this.set = [];
    }

    add(key: number): void {
        this.set[key] = true;
    }

    remove(key: number): void {
        this.set[key]=false;
    }

    contains(key: number): boolean {
        return this.set[key]==true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = new MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
