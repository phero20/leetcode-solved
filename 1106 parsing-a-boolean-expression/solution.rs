use std::collections::VecDeque;
impl Solution {
    pub fn parse_bool_expr(expression: String) -> bool {
        let mut st1: VecDeque<char> = VecDeque::new(); 
        let mut st2: VecDeque<char> = VecDeque::new(); 

        for c in expression.chars() {
            if c == ',' {
                continue;
            } else if c == '|' || c == '&' || c == '!' {
                st2.push_back(c);
            } else if c == 't' || c == 'f' || c == '(' {
                st1.push_back(c);
            } else if c == ')' {
                let op = st2.pop_back().unwrap();
                let mut res = 'f';

                if op == '&' {
                    res = 't';
                    while *st1.back().unwrap() != '(' {
                        let cc = st1.pop_back().unwrap();
                        if cc == 'f' {
                            res = 'f';
                        }
                    }
                } else if op == '|' {
                    res = 'f';
                    while *st1.back().unwrap() != '(' {
                        let cc = st1.pop_back().unwrap();
                        if cc == 't' {
                            res = 't';
                        }
                    }
                } else {
                    let cc = st1.pop_back().unwrap();
                    res = if cc == 't' { 'f' } else { 't' };
                }

                st1.pop_back();
                st1.push_back(res);
            }
        }

        st1.pop_back().unwrap() == 't'
    }
}

