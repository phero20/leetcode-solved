package main

import (
    "fmt"
    "strconv"
)

type Codec struct {
    counter int
    myMap   map[int]string
}

func Constructor() Codec {
    return Codec{
        counter: 0,
        myMap:   make(map[int]string),
    }
}

func (this *Codec) encode(longUrl string) string {
    this.counter++
    this.myMap[this.counter] = longUrl
    return "http://tinyurl.com/" + strconv.Itoa(this.counter)
}

func (this *Codec) decode(shortUrl string) string {
    idx := 0
    for i := len(shortUrl) - 1; i >= 0; i-- {
        if shortUrl[i] == '/' {
            idx, _ = strconv.Atoi(shortUrl[i+1:])
            break
        }
    }
    return this.myMap[idx]
}


/**
 * Your Codec object will be instantiated and called as such:
 * obj := Constructor();
 * url := obj.encode(longUrl);
 * ans := obj.decode(url);
 */

