public class Solution {
    public int MinimumRecolors(string blocks, int k) {
        int count=0;
        for(int i=0;i<k;i++) {
            if(blocks[i]=='W') count++;
        }
        int min=count;
        for(int i=k;i<blocks.Length;i++) {
            if(blocks[i]=='W') count++;
            if(blocks[i-k]=='W') count--;

            min=Math.Min(min,count);
        }
        return min;
    }
}
