impl Solution {
    pub fn count_characters(words: Vec<String>, chars: String) -> i32 {
        let mut map = vec![0;126];
        for c in chars.chars() {
            map[c as usize]+=1;
        }
        let mut sum = 0;
        for w in words {
            let mut map2 = map.clone();
            let mut is = true;
            for c in w.chars() {
                map2[c as usize]-=1;
                if map2[c as usize] < 0{
                    is = false;
                    break;
                }
            }
            if is {
                sum+=w.len() as i32;
            }
        }
        sum
    }
}
