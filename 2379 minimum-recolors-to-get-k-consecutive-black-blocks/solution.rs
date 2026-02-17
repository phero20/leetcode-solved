impl Solution {
    pub fn minimum_recolors(blocks: String, k: i32) -> i32 {
        let k=k as usize;
        let bytes = blocks.as_bytes();
        let mut count=0;
        for i in 0..k {
             if bytes[i]==b'W' {
            count+=1;
            }
        }
        let mut mi=count;
        for i in k..blocks.len() {
            if bytes[i]==b'W' {
            count+=1;
            }
            if bytes[i-k]==b'W' {
            count-=1;
            }
            if  count<mi {
            mi=count;
            }
        }
        mi
    }
}
