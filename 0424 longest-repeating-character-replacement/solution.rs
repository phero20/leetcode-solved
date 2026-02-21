impl Solution {
    pub fn character_replacement(s: String, k: i32) -> i32 {
     let mut arr = [0; 126];
     let mut l=0;
     let mut m=0;
     let mut mxf=0;
     let k = k as usize;
     let bytes = s.as_bytes();
     for r in 0..s.len() {
        arr[bytes[r] as usize]+=1;
        mxf=mxf.max(arr[bytes[r] as usize]);
        while (r-l+1)-mxf > k {
            arr[bytes[l] as usize]-=1;
            l+=1;
        }
        m=m.max((r-l+1) as i32);
     }   
     m
    }
}
