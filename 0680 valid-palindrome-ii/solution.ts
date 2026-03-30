function validPalindrome(s: string): boolean {
    let l=0,r=s.length-1;
    while(l<r) {
        if(s[l]!=s[r]) {
            return isPal(s,l+1,r) || isPal(s,l,r-1);
        }
        l++;
        r--;
    }
      return true;
};

function isPal(s:string,l,r): boolean {
    while(l<r) {
        if(s[l++]!=s[r--]) return false;
    }
    return true;
}
