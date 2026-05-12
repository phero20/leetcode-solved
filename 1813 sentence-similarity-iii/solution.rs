impl Solution {
    pub fn are_sentences_similar(sentence1: String, sentence2: String) -> bool {
        let s1: Vec<&str> = sentence1.split_whitespace().collect();
        let s2: Vec<&str> = sentence2.split_whitespace().collect();

        let (shorter, longer) = if s1.len() <= s2.len() { (s1, s2) } else { (s2, s1) };

        let mut i = 0;
        while i < shorter.len() && shorter[i] == longer[i] {
            i += 1;
        }

        let mut j = 0;
        while j < shorter.len() - i && shorter[shorter.len() - 1 - j] == longer[longer.len() - 1 - j] {
            j += 1;
        }

        i + j == shorter.len()
    }
}

