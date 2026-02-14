func maxArea(height []int) int {
    max:=0
    i,j:=0,len(height)-1

    for i<j {
        ans:=(j-i)*min(height[i],height[j])
        if ans>max {
            max=ans
        }
       if height[i]>height[j] {
        j--
       } else {
        i++
       }
    }
    return max
}
