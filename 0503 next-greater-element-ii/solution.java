class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res = new int[n];
        int[] st= new int[n];
        Arrays.fill(res,-1);
        int top=-1;

        for(int i=0;i<2*nums.length;i++) {
            int num = nums[i%n];
            while(top!=-1 && nums[st[top]]<num) {
                res[st[top--]]=num;
            }

            if(i<n)
             st[++top]=i; 
        }
        return res;
    }
}
