func romanToInt(s string) int {
	var arr [126]int
	arr['I'] = 1
	arr['V'] = 5
	arr['X'] = 10
	arr['L'] = 50
	arr['C'] = 100
	arr['D'] = 500
	arr['M'] = 1000
    ans:=0;
    for i,_ := range s {
        v:=arr[s[i]];
        if i+1 < len(s) && v < arr[s[i+1]] {
            ans-=v
        } else {
            ans+=v
        }
    }
    return ans
}
