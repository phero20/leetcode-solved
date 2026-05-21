func numberOfSteps(num int) int {
     return c(num,0)
}
func c(num int,ct int) int  {
        if( num ==0 ) {
            return ct
        }
        if(num%2==0) {
            return c(num/2,ct+1)
        } else {
             return c(num-1,ct+1)
        }
}
