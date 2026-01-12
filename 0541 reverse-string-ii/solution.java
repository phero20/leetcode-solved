class Solution {
    public String reverseStr(String s, int k) {
        char arr[] = s.toCharArray();
        int l=0;
        while(l<arr.length){
            int r = Math.min(l+k-1,arr.length-1);
            rev(arr,l,r);
            l+=2*k;
        }
        return new String(arr);
    }
    
    void rev(char arr[],int l,int r){
        while(l<r){
            char temp=arr[l];
            arr[l++]=arr[r];
            arr[r--]=temp;
        }
    }
}
