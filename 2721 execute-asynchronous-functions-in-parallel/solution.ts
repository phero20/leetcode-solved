type Fn<T> = () => Promise<T>

function promiseAll<T>(functions: Fn<T>[]): Promise<T[]> {
    return new Promise((resolve,reject)=>{
        let res : T[] = []
        let completed=0
        if (functions.length === 0) {
            resolve([]);
            return
        }
        functions.forEach((fn,ind)=>{
            Promise.resolve()
            .then(fn)
            .then(val=>{
                res[ind]=val
                completed++
                if(completed===functions.length) resolve(res)
            }).catch(reject)
        })
        
    })
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */
