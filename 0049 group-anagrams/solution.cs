public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<string,List<string>> map =new Dictionary<string, List<string>>();
        foreach(var s in strs) {
            var count = new char[26];
            foreach(char c in s) count[c-'a']++;
            string key = new string(count);
            if(!map.ContainsKey(key)) {
                map[key]=new List<string>();
            }
            map[key].Add(s);
        }
        return new List<IList<string>>(map.Values);
    }
}
