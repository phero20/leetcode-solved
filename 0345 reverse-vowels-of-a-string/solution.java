class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0, r=arr.length-1;
         boolean[] vowels = new boolean[128];
        vowels['a'] = vowels['e'] = vowels['i'] = vowels['o'] = vowels['u'] = true;
        vowels['A'] = vowels['E'] = vowels['I'] = vowels['O'] = vowels['U'] = true;
       while(l<r){
            while(l<r && !vowels[arr[l]] ) l++;
            while(l<r && !vowels[arr[r]] ) r--;
            if (l < r) {
          char temp = arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        l++;
        r--;
        }}

        return new String(arr);
    }
}
