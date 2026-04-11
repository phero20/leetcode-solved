type TimeMap struct {
    mapp map[string][]Pair
}

func Constructor() TimeMap {
    return TimeMap{
        mapp: make(map[string][]Pair),
    }
}



func (this *TimeMap) Set(key string, value string, timestamp int)  {
    this.mapp[key] = append(this.mapp[key],Pair{Timestamp: timestamp, Value: value})
}


func (this *TimeMap) Get(key string, timestamp int) string {
    pairs := this.mapp[key]
    res := ""
    if len(pairs) !=0 {
        l,r:=0,len(pairs)-1
        for l<=r {
            mid:=l+(r-l)/2
            if pairs[mid].Timestamp <= timestamp {
                res = pairs[mid].Value
                l = mid+1
            } else {
                r = mid-1
            }
        }
    }
    return res
}





// Define a struct
type Pair struct {
    Timestamp int
    Value     string
}

// Optional constructor-like function
func NewPair(timestamp int, value string) Pair {
    return Pair{Timestamp: timestamp, Value: value}
}



/**
 * Your TimeMap object will be instantiated and called as such:
 * obj := Constructor();
 * obj.Set(key,value,timestamp);
 * param_2 := obj.Get(key,timestamp);
 */
