class Solution {
public:
    long long repairCars(vector<int>& ranks, int cars) {
        long long l=1,r=101;
        for(int i : ranks) {
            if(i<r) r=i;
        }
        r=(long)r*cars*cars;
        while(l<r) {
            long mid = l+(r-l)/2;
            if(pos(ranks,mid,cars)) {
                r=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }
    bool pos(vector<int> nums,long long mid,int c) {
        long long sum = 0;
        for(int i : nums) {
            sum += (long)sqrt((double)mid / i);
        }
        return sum>=c;
    }
};
