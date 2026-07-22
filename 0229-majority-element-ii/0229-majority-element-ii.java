class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums); 
        int n = nums.length / 3;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                list.add(entry.getKey());
            }
        }
        
        return list;
    }
}   