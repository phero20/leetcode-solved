impl Solution {
    pub fn append_characters(s: String, t: String) -> i32 {
        let mut j=0;
        let mut ct=0;
        let ss=s.as_bytes();
        let tt = t.as_bytes();
        for i in 0..ss.len() {
            if j<tt.len() && ss[i]==tt[j] {
                j+=1;
                ct+=1;
            }
        }
        tt.len() as i32 -ct 
    }
}
