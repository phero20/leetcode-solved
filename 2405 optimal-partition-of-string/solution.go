func partitionString(s string) int {
   mask:=0
   count:=1

   for _,v := range s {
    bit:= 1 << (v-'a')
    if (mask & bit) !=0 {
        count++
        mask=0
    }
    mask |= bit
   }
   return count
}
