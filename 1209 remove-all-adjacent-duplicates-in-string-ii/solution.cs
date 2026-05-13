using System;
using System.Collections.Generic;
using System.Text;

public class Solution {
    public string RemoveDuplicates(string s, int k) {
        Stack<(char ch, int cnt)> st = new Stack<(char,int)>();

        foreach (char c in s) {
            if (st.Count > 0 && st.Peek().ch == c) {
                var top = st.Pop();
                top.cnt++;
                if (top.cnt < k) {
                    st.Push(top);
                }
            } else {
                st.Push((c,1));
            }
        }

        StringBuilder sb = new StringBuilder();
        foreach (var item in st) {
            sb.Insert(0, new string(item.ch, item.cnt));
        }
        return sb.ToString();
    }
}

