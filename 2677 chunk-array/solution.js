/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let res=[]
    let pus=[]
    for(let i=0;i<arr.length;i++){
        pus.push(arr[i])
       if(pus.length==size) {
        res.push(pus)
        pus=[]
       }
    }

    if(pus.length>0) res.push(pus)
    return res
};

