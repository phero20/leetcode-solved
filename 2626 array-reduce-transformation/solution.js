/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let v=init;
    for (const i of nums) {
        v = fn(v,i)
    }
    return v
};
