function longestCommonPrefix(strs: string[]): string {
    let str = strs[0];
    for(let i=1;i<strs.length;i++) {
        let curr = strs[i];
        while(!curr.startsWith(str,0)) {
            str = str.substring(0,str.length-1);
            if(str.length==0) return "";
        }
    }
    return str;
};
