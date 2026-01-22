class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            while(i<j && !isChar(arr[i])) i++;
            while(i<j && !isChar(arr[j])) j--;
            char temp=arr[i];
            arr[i++]=arr[j];
            arr[j--]=temp;
        }
        return new String(arr);
    }
    private boolean isChar(char a){
        return((a>='a' && a<='z') || (a>='A' && a<='Z'));
    }
}
