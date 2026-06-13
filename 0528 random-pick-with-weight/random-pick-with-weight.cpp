class Solution {
private:
    vector<int> prefixSum;
    int totalSum;
    mt19937 gen;
    uniform_int_distribution<> dist;

public:
    Solution(vector<int>& w) {
        prefixSum.resize(w.size());
        int currentSum = 0;
        for (int i = 0; i < w.size(); i++) {
            currentSum += w[i];
            prefixSum[i] = currentSum;
        }
        totalSum = currentSum;
        random_device rd;
        gen = mt19937(rd());
        dist = uniform_int_distribution<>(1, totalSum); 
    }
    
    int pickIndex() {
        int target = dist(gen);
        int left = 0, right = prefixSum.size() - 1, res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (prefixSum[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
};
