class Solution {
    public int minimumIndex(int[] c, int it) {
    int bestIdx = -1;
    int minCapacityFound = Integer.MAX_VALUE;
    for (int i = 0; i < c.length; i++) {
        if (c[i] >= it && c[i] < minCapacityFound) {
            minCapacityFound = c[i];
            bestIdx = i;
        }
    }
    return bestIdx;
}
}


