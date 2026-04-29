func maxProductDifference(nums []int) int {
    ma1,ma2:= math.MinInt, math.MinInt
    mi1,mi2:= math.MaxInt, math.MaxInt
    for _,v := range nums {
        if v > ma1 {
            ma2 = ma1
            ma1 = v
        } else if v > ma2 {
            ma2 = v
        }

        if v < mi1 {
            mi2 = mi1 
            mi1 = v
        } else if v < mi2 {
            mi2 = v
        }
    }
    return (ma1 * ma2) - (mi1 * mi2)
}
