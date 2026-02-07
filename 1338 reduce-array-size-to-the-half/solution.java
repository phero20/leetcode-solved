class Solution {
    public int minSetSize(int[] arr) {
       int fr[]=new int[100007];
       for(int i:arr) fr[i]++;
       int[] l1=new int[arr.length];
       int k=0;
       for(int i:fr)
        if(i>0) l1[k++]=i;
        Arrays.sort(l1);
        int res=arr.length;
        for(int i=l1.length-1;i>=0;i--){
            res-=l1[i];
            if(res<=arr.length/2) return l1.length-i;
        }
        return l1.length;
    }
}
