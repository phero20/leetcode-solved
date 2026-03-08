class Solution {
    public String simplifyPath(String path) {

        String[] parts = path.split("/");
        String[] st = new String[parts.length];
        int top = -1;
        for (String s : parts) {
            if (s.equals("") || s.equals(".")) {
                continue; 
            } else if (s.equals("..")) {
                if (top != -1) top--; 
            } else {
                st[++top] = s; 
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            sb.append("/").append(st[i]);
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
