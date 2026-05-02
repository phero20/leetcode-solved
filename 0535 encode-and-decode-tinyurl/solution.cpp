class Solution {
public:
    unordered_map<int,string> map;
    int idx=0;
    // Encodes a URL to a shortened URL.
    string encode(string longUrl) {
        idx++;
        map[idx] = longUrl;
        return to_string(idx);
    }

    // Decodes a shortened URL to its original URL.
    string decode(string shortUrl) {
        return map[stoi(shortUrl)];
    }
};

// Your Solution object will be instantiated and called as such:
// Solution solution;
// solution.decode(solution.encode(url));
