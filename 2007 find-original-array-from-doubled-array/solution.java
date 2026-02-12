class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        if(n %2 !=0) return new int[0];
        int ans[]=new int[n/2];
        int itr=0,max=0;
        for(int i:changed) max=Math.max(max,i);
        int map[]=new int[max*2+1];
        for(int i:changed) map[i]++;
        for(int i=0;i<=max;i++) {
            while(map[i]>0) {
                map[i]--;
                if(map[i*2]>0) {
                    ans[itr++] = i;
                    map[i*2]--;
                }
                else {
                    return new int[]{};
                }
            }
        }
        return ans;
    }
}
