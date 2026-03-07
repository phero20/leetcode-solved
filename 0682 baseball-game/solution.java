class Solution {
    public int calPoints(String[] o) {
        int[] st = new int[o.length];
        int sum=0,top=-1;
        for(String s:o) {
            if(s.equals("C")) top--;
            else if(s.equals("D")) {
                int n=st[top];
                st[++top]=n*2;
            } else if(s.equals("+")) {
                st[++top]=st[top-2]+st[top-1];
            } else 
               st[++top]=Integer.parseInt(s);
        }
        for(int i=0;i<=top;i++) sum+=st[i];
        return sum;
    }
}
