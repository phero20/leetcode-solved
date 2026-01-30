func isPalindrome(x int) bool {
    y:=x;
    r:=0;
    for (y>0){
        d:=y%10;
        r=r*10+d;
        y/=10;
    }
    return r==x
}
