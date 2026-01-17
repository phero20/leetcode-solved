class Solution {
    public String reverseWords(String s) {
        int i=0,j=0;
        char[] arr= s.toCharArray();
        while(j<arr.length){
            if(arr[j]==' ' || j==arr.length-1){
                if(j==arr.length-1) j++;
                rev(arr,i,j-1);
                i=j+1;
            }
            j++;
        }
        return new String(arr);
    }
    private void rev(char arr[],int i,int j){
        while(i<j){
            char temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
