class Solution {
public:
    int minOperations(vector<int>& nums) {
        int ans = 0;
        for(int i = nums.size()-2;i>=0;i--) {
            while(nums[i] > nums[i+1]) {
                int r = gpc(nums[i]);
                if(r==1) return -1;
                nums[i]/=r;
                ans++;
            }
        }
        return ans;
    }
    int gpc(int x) {
        if(x==1) return 1;
        for(int i=2;i*i<=x;i++) {
            if(x%i==0) return x/i;
        }
        return 1;
    }
};
