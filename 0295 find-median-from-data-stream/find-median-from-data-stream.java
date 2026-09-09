class MedianFinder {

    PriorityQueue<Integer> max;
    PriorityQueue<Integer> min;
    public MedianFinder() {
        max = new PriorityQueue<>((a,b) -> b - a);
        min = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        max.offer(num);
        min.offer(max.poll());
        if(max.size() < min.size()) {
            max.offer(min.poll());
        }
    }
    
    public double findMedian() {
        if(max.size() == min.size()) {
            return (double) (max.peek()+min.peek())/2;
        }
        return (double) max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */