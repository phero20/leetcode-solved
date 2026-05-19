class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int[] st = new int[pushed.length];
        int top = -1, top1 = 0;
        for (int i : pushed) {
            st[++top] = i;
            while (top >=0 && top1 < popped.length && popped[top1] == st[top]) {
                top--;
                top1++;
            }
        }
        return top ==-1 && top1 == popped.length;
    }
}
