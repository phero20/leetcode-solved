class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] set = new boolean[baskets.length];
        int c=0;
        for(int i:fruits) {
            boolean pl = false;
            for(int j=0;j<baskets.length;j++) {
                if(i<=baskets[j] && !set[j]) {
                    set[j]=true;
                    pl=true;
                    break;
                }
            }
            if(!pl) c++;
        }
        return c;
    }
}
