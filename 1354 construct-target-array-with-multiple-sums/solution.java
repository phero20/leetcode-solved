class Solution {
    public boolean isPossible(int[] target) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long total = 0;
        for (int i : target) {
            total += i;
            maxHeap.offer(i);
        }
        while (true) {
            int largest = maxHeap.poll();
            long rest = total-largest;
            if(largest==1 || rest==1) return true;
            if (rest == 0 || largest <= rest) return false;
            long prev = largest % rest;
            if (prev == 0) prev = rest;
            if (prev < 1) return false;
            total = rest + prev;
            maxHeap.offer((int) prev);
        }
    }

}
