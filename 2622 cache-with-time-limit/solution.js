var TimeLimitedCache = function() {
    this.cache = {};
};

TimeLimitedCache.prototype.set = function(key, value, duration) {
    const now = Date.now();
    const existed = this.cache[key] !== undefined && this.cache[key].timeout > now;
    this.cache[key] = { value, timeout: now + duration };
    return existed;   // must explicitly return
};

TimeLimitedCache.prototype.get = function(key) {
    const now = Date.now();
    if (this.cache[key] && this.cache[key].timeout > now) {
        return this.cache[key].value;
    }
    return -1;
};

TimeLimitedCache.prototype.count = function() {
    const now = Date.now();
    let cnt = 0;
    for (const key in this.cache) {
        if (this.cache[key].timeout > now) {
            cnt++;
        }
    }
    return cnt;
};
