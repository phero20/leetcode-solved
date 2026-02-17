impl Solution {
    pub fn decrypt(code: Vec<i32>, k: i32) -> Vec<i32> {
       let n = code.len();
       let mut ans = vec![0; n];
       if k==0 {
       return ans;
       }
       let mut sum = 0;
       let (mut s,mut e);
       if k>0 {
       let k = k as usize; 
       s=1;
       e=k;
       for i in s..=e {
            sum+=code[i%n];
        }
        for i in 0..n {
        ans[i]=sum;
        sum-=code[(i+1)%n];
        sum+=code[(i+k+1)%n];
        }
        } else {
       let k = (-k) as usize;
        s=n-k;
        e=n-1;
        for i in s..=e {
            sum+=code[i%n];
        }
        for i in 0..n {
        ans[i]=sum;
        sum-=code[(n+i-k)%n];
        sum+=code[i];
        }
        }
        ans
    }
}
