public class Solution {
    public int SecondHighest(string s) {
        int fmax=-1,smax=-1;
        foreach(char i in s) {
            if(Char.IsDigit(i)) {
                int num=(int)i-48;
                if(num>fmax){
                    smax=fmax;
                    fmax=num; 
                } else if(num>smax && num<fmax) {
                    smax=num;
                }
            }
        }
        return smax;
    }
}
