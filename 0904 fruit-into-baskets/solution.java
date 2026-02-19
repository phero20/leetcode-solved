class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,sum=0,d=0,m=0;
        int arr[]=new int[100007];

        for(int r=0;r<fruits.length;r++) {
           if(arr[fruits[r]]==0) d++;
           arr[fruits[r]]++;

           while(d>2) {
            arr[fruits[l]]--;
            if(arr[fruits[l]]==0) d--;
            l++;
           }
           m=Math.max(m,r-l+1);
        }
        return m;
    }
}
