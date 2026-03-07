func trap(h []int) int {
   l,lm,rm,w,r:=0,0,0,0,len(h)-1 
   for l<r {
        if h[l] < h[r] {
            if h[l]>=lm {
                lm=h[l]
            } else {
                w+=lm-h[l]
            }
            l++
        } else {
            if h[r] >= rm {
                rm=h[r]
            } else {
                w+=rm-h[r]
            }
            r--
        }
   }
   return w
}
