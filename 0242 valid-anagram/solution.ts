function isAnagram(s: string, t: string): boolean {
    if(s.length!=t.length) return false;
    let count: Record<string, number> = {};
    for(let c of s) count[c] = (count[c] || 0) + 1;
    for(let i of t) {
        if(!count[i]) return false;
        count[i]--;
    }
    return true;
};
