impl Solution {
    pub fn vowel_strings(words: Vec<String>, queries: Vec<Vec<i32>>) -> Vec<i32> {
        let n = words.len();
        let mut pr = vec![0; n + 1];

        for i in 0..n {
            let s = &words[i];
            let first = s.chars().next().unwrap();
            let last = s.chars().last().unwrap();

            if Self::is_vowel(first) && Self::is_vowel(last) {
                pr[i + 1] = pr[i] + 1;
            } else {
                pr[i + 1] = pr[i];
            }
        }

        let q = queries.len();
        let mut ans = vec![0; q];
        for i in 0..q {
            let st = queries[i][0] as usize;
            let ed = (queries[i][1] + 1) as usize;
            ans[i] = pr[ed] - pr[st];
        }
        ans
    }

    fn is_vowel(c: char) -> bool {
        matches!(c, 'a' | 'e' | 'i' | 'o' | 'u'
                    | 'A' | 'E' | 'I' | 'O' | 'U')
    }
}


