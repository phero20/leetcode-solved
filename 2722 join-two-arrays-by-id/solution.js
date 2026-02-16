/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
   const res = {}
   for(const obj of arr1) {
    res[obj.id]={...obj}
   }

   for(const obj of arr2) {
    if(res[obj.id]) {
        res[obj.id]={...res[obj.id], ...obj}
    } else {
        res[obj.id]={...obj}
    }
   }
   return Object.values(res).sort((a,b)=>a.id-b.id)
};
