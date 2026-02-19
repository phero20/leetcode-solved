func totalFruit(fruits []int) int {
  l,m,d:=0,0,0
  var arr [100007]int

  for r,v :=range fruits {
    if arr[v]==0 {
        d++
    }
    arr[v]++

    for d>2 {
        arr[fruits[l]]--
        if arr[fruits[l]]==0 {
            d--
        }
        l++
    }
    m=max(m,r-l+1)
  }  
  return m
}
