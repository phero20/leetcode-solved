type MinStack struct {
    st     []int 
    minSt int
}

func Constructor() MinStack {
    return MinStack{
        st:     []int{},
        minSt: math.MaxInt,
    }
}

func (this *MinStack) Push(val int) {
   if val <= this.minSt {
        this.st = append(this.st,this.minSt)
        this.minSt = val
   }
   this.st = append(this.st,val)
}

func (this *MinStack) Pop() {
    if this.minSt == this.st[len(this.st)-1] {
        this.st = this.st[:len(this.st)-1]
        this.minSt = this.st[len(this.st)-1]
    }
    this.st = this.st[:len(this.st)-1]
}

func (this *MinStack) Top() int {
    return this.st[len(this.st)-1]
}

func (this *MinStack) GetMin() int {
    return this.minSt
}
