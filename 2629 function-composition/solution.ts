type F = (x: number) => number;

function compose(functions: F[]): F {
    
    return function(x) {
        let v=x;
        for(const fn of functions.reverse()) {
            v=fn(v);
        }
        return v;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
