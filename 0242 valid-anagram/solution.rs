impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
    let mut chars1: Vec<char> = s.chars().collect();
    let mut chars2: Vec<char> = t.chars().collect();

    chars1.sort_unstable();
    chars2.sort_unstable();

    let sorted1: String = chars1.into_iter().collect();
    let sorted2: String = chars2.into_iter().collect();

    return sorted1==sorted2 
    }
}
