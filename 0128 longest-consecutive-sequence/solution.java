class Solution {
    public int longestConsecutive(int[] nums) {
    // Set<Integer> set = new HashSet<>();
    // for(int i:nums) set.add(i);
    // int l=0;
    // for(int v:set) {
    //     if(!set.contains(v-1)) {
    //         int c=v,st=1;

    //         while(set.contains(c+1)) {
    //             c++;
    //             st++;
    //         }
    //         l=Math.max(l,st);
    //     }
    // }

    // return l;
    if(nums.length==0) return 0;

    Arrays.sort(nums);
    int st=1,c=0;
    for(int i=1;i<nums.length;i++) {
        if(nums[i]==nums[i-1]) continue;
        if(nums[i]==nums[i-1]+1) {
            st++;
        }
        else {
           c = Math.max(st,c);
           st=1;
        }
    }
    return Math.max(st,c);
    }
}
