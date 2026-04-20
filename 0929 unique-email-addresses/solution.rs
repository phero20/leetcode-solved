use std::collections::HashSet;
impl Solution {
    pub fn num_unique_emails(emails: Vec<String>) -> i32 {
        let mut set = HashSet::new();
        for email in emails {
            let idx = email.find("@").unwrap();
            let mut localName = &email[..idx];
            let domainName = &email[idx+1..];
             if let Some(pIdx) = email.find("+") {
                localName = &email[..pIdx];
             }
             let cl = localName.replace(".","");
             set.insert(format!("{}@{}", cl, domainName));
        }
    set.len() as i32
    }
}
