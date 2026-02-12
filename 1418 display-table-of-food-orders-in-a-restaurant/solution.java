class Solution {
    public List<List<String>> displayTable(List<List<String>> orders) {
        Map<Integer, Map<String, Integer>> map = new HashMap<>();
        Set<String> dishes = new TreeSet<>();
        for (List<String> s : orders) {
            int table = Integer.parseInt(s.get(1));
            String dish = s.get(2);
            Map<String, Integer> dishCount = map.computeIfAbsent(table, k -> new HashMap<>());
            dishCount.put(dish, dishCount.getOrDefault(dish, 0) + 1);
            dishes.add(dish);
        }

        List<List<String>> ans = new ArrayList<>();
        List<String> coloumNames = new ArrayList<>();
        coloumNames.add("Table");
        coloumNames.addAll(dishes);
        ans.add(coloumNames);

        List<Integer> tables = new ArrayList<>(map.keySet());
        Collections.sort(tables);
        for (int table : tables) {
            List<String> row = new ArrayList<>();
            row.add(String.valueOf(table));
            Map<String, Integer> ma = map.get(table);

            for (String dish : dishes) {
                row.add(String.valueOf(ma.getOrDefault(dish, 0)));
            }
            ans.add(row);

        }
        return ans;

    }
}
