class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        String s = "";
        for(char c:searchWord.toCharArray()) {
            s = s+c;
            ans.add(bin(s,products));
        }
        return ans;
    }
    private List<String> bin(String s,String[] nums) {
        int l=0,r=nums.length-1;
        List<String> ans = new ArrayList<>();
        while(l<r) {
            int mid = l+(r-l)/2;
             if(nums[mid].compareTo(s) < 0) {
                l=mid+1;
             } else {
                r=mid;
             }
        }
        for(int i=l;i<nums.length && ans.size() < 3 ;i++) {
            if(nums[i].startsWith(s)) {
                ans.add(nums[i]);
            } else {
                break;
            }
        }
        return ans;
    }
}