func leastInterval(tasks []byte, n int) int {
   var arr [26]int
   var max,co int

    for _,v := range tasks {
       arr[v-'A']++
       if max<arr[v-'A'] {
         max=arr[v-'A']
         co=1
       }  else if arr[v-'A']==max {
          co++
       }
    }
    res:=(max-1)*(n+1)+co
    if(len(tasks)<res) {
        return res
    }
    return len(tasks)
}
