class TimeLimitedCache {
    private cache: Record<number, { value: number, expiry: number }> = {};

    set(key: number, value: number, duration: number): boolean {
        const now = Date.now();
        const existed = this.cache[key] !== undefined && this.cache[key].expiry > now;

        this.cache[key] = {
            value,
            expiry: now + duration
        };

        return existed;
    }

    get(key: number): number {
        const now = Date.now();
        if (this.cache[key] && this.cache[key].expiry > now) {
            return this.cache[key].value;
        }
        return -1;
    }

    count(): number {
        const now = Date.now();
        let active = 0;
        for (const k in this.cache) {
            if (this.cache[k].expiry > now) {
                active++;
            }
        }
        return active;
    }
}
