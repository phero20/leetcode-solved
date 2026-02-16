type Fn = (...params: any) => any

function memoize(fn: Fn): Fn {
    const cache = new Map();
    return function(...args) {
        let current = cache;

        for(let arg of args) {
            if(!current.has(arg)) {
                current.set(arg,new Map());
            }
            current = current.get(arg)
        }

        if(current.has('result')) {
            return current.get('result')
        }

        const res= fn(...args)
        current.set('result',res);
        return res;
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */
