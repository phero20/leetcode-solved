
public class Solution {
    public int MinCapability(int[] nums, int k) {
        int l = int.MaxValue, r = int.MinValue, ans = 0;
        foreach (int i in nums) {
            l = Math.Min(l, i);
            r = Math.Max(r, i);
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (Pos(nums, mid, k)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    private bool Pos(int[] nums, int mid, int k) {
        int c = 0;
        for (int i = 0; i < nums.Length; i++) {
            if (nums[i] <= mid) {
                c++;
                i++; 
            }
        }
        return c >= k;
    }
}

