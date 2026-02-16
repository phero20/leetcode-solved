type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type ArrayType = { "id": number } & Record<string, JSONValue>;

function join(arr1: ArrayType[], arr2: ArrayType[]): ArrayType[] {
    const res: Record<number, ArrayType> = {};

    for(const obj of arr1) {
        res[obj.id]={...obj}
    }

    for(const obj of arr2) {
        if(res[obj.id]) {
            res[obj.id]={...res[obj.id], ...obj}
        } else {
            res[obj.id] = {...obj}
        }
    }
    return Object.values(res).sort((a,b)=>a.id-b.id)
};
