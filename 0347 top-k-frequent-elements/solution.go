func topKFrequent(nums []int, k int) []int {
    arr := make(map[int]int)
    maxfreq:=0
    for _,value:= range nums {
        arr[value]++
        if arr[value] > maxfreq {
            maxfreq = arr[value]
        }
    }
   bucket := make(map[int][]int)
   for index,value := range arr {
     if value > 0 {
        bucket[value] = append(bucket[value],index)
     }
   }

   res:=make([]int,0,k)
   for i:=maxfreq;i>0 && len(res) < k;i-- {
    for _,val := range bucket[i] {
        res = append(res,val)
        if len(res) == k {
                return res
            }
    }
   }
   return res
}
