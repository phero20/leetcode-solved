class Solution {
    public int smallestAbsent(int[] nums) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            sum += i;
            set.add(i);
        }
        double avg = (double) sum / nums.length;
        int candidate = (int) Math.floor(avg) + 1;
        if (candidate < 1) {
            candidate = 1;
        }
        while (set.contains(candidate)) {
            candidate++;
        }
        return candidate;
    }
}
