class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int count1=0,count2=0;
        int e1=0,e2=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(e1==num) count1++;
            else if(e2==num ) count2++;
            else if(count1==0){e1=num;count1++;}
            else if(count2==0){e2=num;count2++;}
            else{count1--;count2--;}
        }
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(num==e1) count1++;
            else if(num==e2) count2++;
        }  
        if(count1>nums.length/3) l.add(e1);
        if(count2>nums.length/3) l.add(e2);
        return l;

    }
}
