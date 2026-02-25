import (
    "fmt"
    "strconv"
)


type stack []int
func evalRPN(tokens []string) int {
    var st stack
    st1,st2:=0,0
    for _,token:=range tokens {
        switch token {
            case "+" : st.push(st.pop() + st.pop())
            case "-" :
                st2=st.pop()
                st1=st.pop()
                st.push(st1-st2)
            case "*" : st.push(st.pop() * st.pop())
            case "/" : 
                st2=st.pop()
                st1=st.pop()
                st.push(st1/st2)
            default:
            num,_:=strconv.Atoi(token)
                st.push(num)
        }
    }
    return st.pop()
}


func(s *stack) push(v int) {
    *s=append(*s,v)
}

func(s *stack) pop() int{
    if(len(*s)==0){ panic("empty stack")}
    top:=(*s)[len(*s)-1]
    *s=(*s)[:len(*s)-1]
    return top
}
