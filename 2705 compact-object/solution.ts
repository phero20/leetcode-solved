type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Obj = Record<string, JSONValue> | Array<JSONValue>;

function compactObject(obj: Obj): Obj {
    if (Array.isArray(obj)) {
        // Recurse into elements, filter out falsy
       return obj.map((el) => compactObject(el as Obj)).filter(Boolean);
    }
    else if (obj!==null && typeof obj === 'object'){
        const res: { [key: string]: JSONValue } = {};

        for(const [key,val] of Object.entries(obj)) {
            const compacted = compactObject(val as Obj);
            if (Boolean(compacted)) {
                res[key] = compacted;
            }      
        }
         return res
    }
    else {
        return obj
    }
};
