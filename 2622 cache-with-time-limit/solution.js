var TimeLimitedCache = function() {
    this.cache = {};
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const existed = this.cache[key] !== undefined && this.cache[key].expiry > now;

    this.cache[key] = {
        value,
        expiry: now + duration
    };

    return existed;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();
    if (this.cache[key] && this.cache[key].expiry > now) {
        return this.cache[key].value;
    }
    return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let count = 0;
    for (const entry of Object.values(this.cache)) {
        if (entry.expiry > now) {
            count++;
        }
    }
    return count;
};
