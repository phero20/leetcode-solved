public class Solution {
    public int NumRescueBoats(int[] people, int limit) {
        Array.Sort(people);
        int i=0,j=people.Length-1,c=0;
        while(i<=j) {
            if(people[i]+people[j] <= limit ) i++;
            j--;
            c++;
        }
        return c;
    }
}
