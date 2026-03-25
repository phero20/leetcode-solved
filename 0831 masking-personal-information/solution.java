class Solution {
    public String maskPII(String s) {
        if (s.contains("@")) {
            s = s.toLowerCase();
            String[] parts = s.split("@");
            String name = parts[0];
            String domain = parts[1];
            return name.charAt(0) + "*****" + name.charAt(name.length() - 1) + "@" + domain;
        } else {
            String digits = s.replaceAll("[^0-9]", "");
            String local = digits.substring(digits.length() - 4);
            StringBuilder masked = new StringBuilder("***-***-").append(local);

            if (digits.length() > 10) {
                int countryLen = digits.length() - 10;
                masked.insert(0, "+" + "*".repeat(countryLen) + "-");
            }
            return masked.toString();
        }
    }
}
