class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // List<List<Integer>> res = new ArrayList<>();
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i:nums) map.merge(i,1,Integer::sum);
        // while(!map.isEmpty()){
        //     List<Integer> l = new ArrayList<>();
        //     Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
        //       while (it.hasNext()) {
        //         Map.Entry<Integer,Integer> e = it.next();
        //         if(e.getValue()>0) {
        //             l.add(e.getKey());
        //             e.setValue(e.getValue()-1);
        //         }
        //                     if(e.getValue() == 0) it.remove();
        //     }

        //     res.add(l);
        // }
        // return res;



        int[] arr = new int[nums.length+1];
        for(int i:nums) arr[i]++;
        List<List<Integer>> res = new ArrayList<>();             
        boolean hasNext = true;
        while(hasNext){
            List<Integer> l = new ArrayList<>();
            hasNext = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0) {
                    l.add(i);
                    arr[i]--;
                    if(arr[i]>0) hasNext=true;
                }  
            }       
             
             if(l.size()>0) res.add(l);

             }

             return res;

    }
}
