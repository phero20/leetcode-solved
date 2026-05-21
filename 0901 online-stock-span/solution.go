type pair struct {
    price int
    span  int
}

type StockSpanner struct {
    st []pair
}

func Constructor() StockSpanner {
     return StockSpanner{st: []pair{}}
}


func (this *StockSpanner) Next(price int) int {
    s:=1
    for len(this.st) > 0 && this.st[len(this.st)-1].price <= price {
        s+=this.st[len(this.st)-1].span
        this.st = this.st[:len(this.st)-1]
    }
    this.st = append(this.st,pair{price,s})
    return s
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Next(price);
 */
