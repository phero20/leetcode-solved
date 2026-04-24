impl Solution {
    pub fn can_construct(ransom_note: String, magazine: String) -> bool {
        let mut c = vec![0;126];
        for i in magazine.chars() {
            c[i as usize]+=1;
        }
        for i in ransom_note.chars() {
            c[i as usize]-=1;
            if c[i as usize] < 0 {
                return false;
            }
        }
        true
    }
}
