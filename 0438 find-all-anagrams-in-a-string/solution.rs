impl Solution {
    pub fn find_anagrams(s: String, p: String) -> Vec<i32> {
        let mut ans :Vec<i32> = Vec::new();
        if s.len()<p.len(){
            return ans;
        }
        let mut c1=[0; 126];
        let mut c2=[0; 126];
        let k=p.len();
        let s1=s.as_bytes();
        let p1=p.as_bytes();

        for i in 0..k {
            c1[p1[i] as usize]+=1;
            c2[s1[i] as usize]+=1;
        }

        if(c1==c2) {
            ans.push(0);
        }

        for r in k..s1.len()  {
            c2[s1[r] as usize]+=1;
            c2[s1[r-k] as usize]-=1;
            if(c1==c2) {
                ans.push((r-k+1) as i32);
        }
        }
        ans
    }
}
