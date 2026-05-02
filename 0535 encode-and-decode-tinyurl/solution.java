public class Codec {
    private static int idx = 0;
    private static final String BASE = "http://tinyurl.com/";
    Map<Integer,String> map;
    Codec() {
        map = new HashMap<>();
    }
    public String encode(String longUrl) {
        idx++;
        map.put(idx,longUrl);
        return String.valueOf(idx);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
         return map.get(Integer.parseInt(shortUrl));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
