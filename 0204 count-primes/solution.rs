impl Solution {
    pub fn count_primes(n: i32) -> i32 {
        if n<=2 {
            return 0
        }
        let mut pr=vec![true; n as usize];
        pr[0]=false;
        pr[1]=false;
        let mut count=0;
        for i in 2..n {
            if pr[i as usize] {
                let mut j=(i as usize) * (i as usize);
                while j<n as usize{
                    pr[j as usize]=false;
                    j+=i as usize;
                }
            }
        }
        pr.iter().filter(|&&p| p).count() as i32
    }
}
