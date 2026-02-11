type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Obj = Record<string, JSONValue> | Array<JSONValue>;

function chunk(arr: Obj[], size: number): Obj[][] {
    let res : Obj[][] = []
    let pus : Obj[] = []
    for(let i=0;i<arr.length;i++) {
        pus.push(arr[i])
        if(pus.length==size) {
            res.push(pus)
            pus=[]
        }
    }
    if(pus.length>0) res.push(pus)
    return res
};

