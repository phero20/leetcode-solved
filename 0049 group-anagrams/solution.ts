function groupAnagrams(strs: string[]): string[][] {
    let map = new Map();
    for(const str of strs) {
        let key = str.split('').sort().join('');
        if(!map.has(key)) {
            map.set(key,[]);
        }
        map.get(key).push(str);
    }
    let ans = [];
    for(let [_,val] of map) {
        ans.push(val);
    }
    return ans;
};
