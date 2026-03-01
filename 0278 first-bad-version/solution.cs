/* The isBadVersion API is defined in the parent class VersionControl.
      bool IsBadVersion(int version); */

public class Solution : VersionControl {
    public int FirstBadVersion(int n) {
        int low=1,high=n,mid=low+(high-low)/2;
        while(low<high) {
            if(IsBadVersion(mid)) high=mid;
            else low=mid+1;
            mid=low+(high-low)/2;
        }
        return high;
    }
}
