impl Solution {
    pub fn divisor_substrings(num: i32, k: i32) -> i32 {
        let str = num.to_string();
        let mut c=0;
        let k=k as usize;

        for i in 0..str.len()-k+1 {
            let sub = &str[i..i+k];
            let v:i32=sub.parse().unwrap();
            if v!=0 && num%v==0 {
                c+=1;
            }
        }
        c
    }
}
