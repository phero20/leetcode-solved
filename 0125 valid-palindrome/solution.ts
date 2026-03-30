function isPalindrome(s: string): boolean {
    s = s.toLowerCase();
    let l=0,r=s.length-1;
    while(l<r) {
        while(l<r && !isChar(s[l])) l++;
        while(l<r && !isChar(s[r])) r--;
        if(s[l]!=s[r]) return false;
        l++;
        r--;
    }
    return true;   
};

function isChar(c) {
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            return true;
        return false;
}
