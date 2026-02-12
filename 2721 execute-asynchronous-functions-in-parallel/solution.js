/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise((resolve,reject)=>{
        const res=[]
    let completed = 0
    functions.forEach((fn,ind)=>{
        Promise.resolve()
        .then(fn)
        .then(val=>{
            res[ind]=val
            completed++
            if(completed===functions.length) resolve(res)
        }).catch(reject)
    })
    if (functions.length === 0) {
            resolve([]);
    }
    })
    
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */
