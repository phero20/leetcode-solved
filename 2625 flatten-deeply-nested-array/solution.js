/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if (n === 0) return arr.slice(); 
    let res=[]
     for (let el of arr) {
        if (Array.isArray(el) && n > 0) {
            // flatten one level and reduce depth
            res.push(...flat(el, n - 1));
        } else {
            res.push(el);
        }
    }
    return res;


};
