type MultiDimensionalArray = (number | MultiDimensionalArray)[];

var flat = function (arr:  MultiDimensionalArray, n: number):  MultiDimensionalArray {
    if (n === 0) return arr.slice(); // no flattening

    const result = [];
    for (let el of arr) {
        if (Array.isArray(el) && n > 0) {
            // flatten one level and reduce depth
            result.push(...flat(el, n - 1));
        } else {
            result.push(el);
        }
    }
    return result;

}
