impl Solution {
    pub fn maximum_length_substring(s: String) -> i32 {
        let mut arr = [0; 126];
        let mut l = 0;
        let mut m = 0;
        let bytes = s.as_bytes();
        for r in 0..bytes.len() {
            arr[bytes[r] as usize]+=1;
            while arr[bytes[r] as usize]>2 {
                arr[bytes[l] as usize]-=1;
                l+=1;
            }
            m=m.max((r-l+1) as i32);
        }
        m
    }
}
