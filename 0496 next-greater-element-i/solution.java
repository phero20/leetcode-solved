class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map<Integer,Integer> map = new HashMap<>();
        int[] st = new int[nums2.length];
        int top=-1;
        for(int i : nums2) {
            while(top>=0 && st[top]<i)
            map.put(st[top--],i);
            st[++top]=i;
        }
         while (top >= 0) {
            map.put(st[top--], -1);
        }
        int[] res = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}
