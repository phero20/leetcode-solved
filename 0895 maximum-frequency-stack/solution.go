type FreqStack struct {
    freq  map[int]int  
    group map[int][]int 
    maxFreq int         
}

func Constructor() FreqStack {
    return FreqStack{
        freq:  make(map[int]int),
        group: make(map[int][]int),
        maxFreq: 0,
    }
}




func (this *FreqStack) Push(val int)  {
    this.freq[val]++;
    fr := this.freq[val]
    this.group[fr] = append(this.group[fr],val)
    this.maxFreq = max(this.maxFreq,fr)
}


func (this *FreqStack) Pop() int {
    st := this.group[this.maxFreq]
    n := len(st)
    val := st[n-1]
    this.group[this.maxFreq] = st[:n-1]
    this.freq[val]--
    if len(this.group[this.maxFreq])==0 {
        this.maxFreq--
    }
    return val
}


/**
 * Your FreqStack object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Push(val);
 * param_2 := obj.Pop();
 */
