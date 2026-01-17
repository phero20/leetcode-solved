class Solution {
    public String reversePrefix(String s, int k) {
        char[] arr=s.toCharArray();
        if(k==1 || k==0) return s;
        for(int i=0;i<k/2;i++){
            char temp = arr[i];
            arr[i]=arr[k-i-1];
            arr[k-i-1]=temp;
        }
        return new String(arr);
    }
}
