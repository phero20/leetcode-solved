class Solution {
    public void duplicateZeros(int[] arr) {
         int[] copy = arr.clone();
        int j=0;
        for(int i=0;i<copy.length && j<arr.length ;i++){
     
            if(copy[i]==0){
                arr[j++]=0;
                 if(j<arr.length)
                arr[j++]=0;
            }
            else          
            arr[j++]=copy[i];
  
  
        }
    }
}
