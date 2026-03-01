impl Solution {
    pub fn second_highest(s: String) -> i32 {
       let mut f=-1;
       let mut l=-1;
       for i in s.chars() {
            if i.is_ascii_digit() {
                let num:i32 =  (i as u8 - b'0') as i32;
                if num > f {
                    l=f;
                    f=num;
                } else if num>l && num<f {
                    l=num;
                }
            }
       }
       l 
    }
}
