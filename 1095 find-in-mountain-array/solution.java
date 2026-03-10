/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray m) {
        int low=0,high=m.length()-1;
        while(low<high) {
            int mid = low+(high-low)/2;
            if(m.get(mid)<m.get(mid+1)) low=mid+1;
            else high=mid;
        }
        int peak = low;
        int ans = bin(m,target,0,peak,true);
        if(ans!=-1) return ans;
        return bin(m,target,peak+1,m.length()-1,false);
    }

    private int bin(MountainArray m, int target,int low,int high,boolean asc)
    {
        while(low<=high) {
            int mid = low+(high-low)/2;
            int ans =m.get(mid);
            if(ans==target) return mid;
            if(asc) {
                if(ans<target) {
                    low=mid+1;
                } else {
                    high=mid-1;
                }
            } else {
                if(ans<target) {
                    high=mid-1;
                } else {
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
