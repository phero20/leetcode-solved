function memoize(fn) {
    const cache = new Map();

    return function(...args) {
        let current = cache;

        for (let arg of args) {
            if (!current.has(arg)) {
                current.set(arg, new Map());
            }
            current = current.get(arg);
        }

        if (current.has('result')) {
            return current.get('result');
        }

        const res = fn(...args);
        current.set('result', res);
        return res;
    };
}
