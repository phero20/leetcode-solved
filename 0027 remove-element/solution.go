func removeElement(nums []int, val int) int {
    j:=0
   for _,value:= range nums{
    if(value!=val){
        nums[j]=value;
        j++;
    }
   }
   return j;
}
