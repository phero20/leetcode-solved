class Solution {
    public int[] asteroidCollision(int[] as) {
        int[] st = new int[as.length];
        int top = -1;
        for (int i : as) {
            boolean a = true;
            while (a && top >= 0 && st[top] > 0 && i < 0) {
                if (st[top] < -i)
                    top--;
                else if (st[top] == -i) {
                    top--;
                    a = false;
                } else {
                    a = false;
                }
            }
            if (a)
                st[++top] = i;
        }

        int[] ans = new int[top + 1];
        for (int i = 0; i <= top; i++) {
            ans[i] = st[i];
        }
        return ans;
    }
}
