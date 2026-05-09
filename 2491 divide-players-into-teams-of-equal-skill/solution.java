class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        long ans = 0;
        int target = skill[0] + skill[n-1];
        int l = 0, r = n-1;
        while(l<r) {
            int sum = skill[l]+skill[r];
            if(sum!=target) return -1;
            ans+=(long)(skill[l++]*skill[r--]);
        }
        return ans;
    }
}
