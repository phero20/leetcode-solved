class Solution {
public:
    int minCapability(vector<int>& nums, int k) {
        int l = *min_element(nums.begin(), nums.end());
        int r = *max_element(nums.begin(), nums.end());
        int ans = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (pos(nums, mid, k)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

private:
    bool pos(vector<int>& nums, int mid, int k) {
        int c = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] <= mid) {
                c++;
                i++; 
            }
        }
        return c >= k;
    }
};

