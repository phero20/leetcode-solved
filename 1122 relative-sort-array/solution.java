class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
        for(int i:arr1) arr[i]++;
        int k =0;
        for(int i:arr2) {
            while(arr[i]-- > 0) {
                arr1[k++] = i;
            }
        }
        for(int i=0;i<arr.length;i++) {
            while(arr[i]-- > 0) {
                arr1[k++] = i;
            }
        }
        return arr1; 
    }
}
