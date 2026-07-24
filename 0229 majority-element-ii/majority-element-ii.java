class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0,ct1=0,ct2=0;
        for(int i:nums) {
            if((ct1==0 || c1==i) && (c2!=i)) {
                ct1++;
                c1=i;
            } else if(ct2==0 || c2==i) {
                ct2++;
                c2=i;
            } else {
                ct1--;
                ct2--;
            }
        }
        ct1=0;
        ct2=0;
        for(int i:nums) {
            if(i==c1) ct1++;
            else if(i==c2) ct2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(ct1 > nums.length/3) ans.add(c1);
        if(ct2 > nums.length/3) ans.add(c2);
        return ans;
    }
}