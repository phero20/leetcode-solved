class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        fr = defaultdict(int)
        fr[0]=1
        pr,ans=0,0
        for i in nums:
            pr+=i
            ans+=fr.get(pr-k,0)
            fr[pr]+=1
        return ans
