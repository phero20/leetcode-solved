class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails) {
            int atIdx = email.indexOf("@");
            String localName = email.substring(0,atIdx);
            String domainName = email.substring(atIdx);
            int plusIdx = localName.indexOf("+");
            if(plusIdx!=-1) {
                localName = email.substring(0,plusIdx);
            }
            localName = localName.replace(".","");
            set.add(localName+domainName);
        }
        return set.size();
    }
}
