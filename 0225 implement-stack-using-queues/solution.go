type MyStack struct {
    q []int
}


func Constructor() MyStack {
   return MyStack{
        q: []int{},
    }
}


func (this *MyStack) Push(x int)  {
    this.q = append(this.q,x)
    n:=len(this.q)
    for i:=0;i<n-1;i++ {
        t:=this.q[0]
        this.q = this.q[1:]
        this.q = append(this.q,t)
    }
}


func (this *MyStack) Pop() int {
    val := this.q[0]
    this.q = this.q[1:]
    return val
}


func (this *MyStack) Top() int { 
    return this.q[0]
}


func (this *MyStack) Empty() bool {
    return len(this.q) == 0
}


/**
 * Your MyStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(x);
 * param_2 := obj.Pop();
 * param_3 := obj.Top();
 * param_4 := obj.Empty();
 */
