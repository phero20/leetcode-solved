func maxProfit(prices []int) int {
   low:=math.MaxInt
   gap:=0
   for _,v := range prices {
    if v<low {
        low=v
    } else {
        gap = max(gap,v-low)
    }
   }
   return gap
}
