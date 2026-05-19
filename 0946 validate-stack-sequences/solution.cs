public class Solution {
    public bool ValidateStackSequences(int[] pushed, int[] popped) {
        int[] st = new int[pushed.Length];
        int top = -1, top1 = 0;
        foreach(int i in pushed) {
            st[++top] = i;
            while (top >=0 && top1 < popped.Length && popped[top1] == st[top]) {
                top--;
                top1++;
            }
        }
        return top ==-1 && top1 == popped.Length;
    }
}
