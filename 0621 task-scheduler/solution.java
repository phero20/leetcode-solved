class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for (char c : tasks) arr[c - 'A']++;
        
        int max = 0;
        for (int i : arr) max = Math.max(max, i);
        
        int countMax = 0;
        for (int i : arr) if (i == max) countMax++;

        return Math.max(tasks.length,(max - 1) * (n + 1) + countMax);
    }
}
