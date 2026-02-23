public class Solution {
    public IList<int> SelfDividingNumbers(int left, int right) {
        IList<int> l = new List<int>();
        for(int n=left;n<=right;n++){
            if(isDiv(n)) l.Add(n);
        }
        return l;
    }
    private bool isDiv(int n){
        for(int i=n;i>0;i/=10){
            int dig=i%10;
            if(dig==0 || n%dig!=0) return false;
        }
        return true;
    }
}
