func compress(chars []byte) int {
    write,c:=0,1
    for i:=1;i<=len(chars);i++ {
        if i==len(chars) || chars[i]!=chars[i-1] {
            chars[write] = chars[i-1]
            write++
            if c > 1 {
                for _, v := range strconv.Itoa(c) {
                    chars[write] = byte(v)
                    write++
                }
            }
            c = 1
        } else {
            c++
        }
    }
    return write
}
