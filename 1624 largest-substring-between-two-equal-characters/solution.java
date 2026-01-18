class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
    int[] arr=new int[26];
    Arrays.fill(arr,-1);
    int max=-1;
    for(int i=0;i<s.length();i++){
        int idx=s.charAt(i)-'a';
        if(arr[idx]==-1) arr[idx]=i;
        else max=Math.max(max,i-arr[idx]-1);
    }
    return max;
}
}
