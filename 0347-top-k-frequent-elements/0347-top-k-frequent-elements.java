class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1);
        Map<Integer, Integer> hash = new HashMap<>();
        for (int num : nums) {
            if (hash.containsKey(num)) {
                hash.put(num, hash.get(num) + 1);
            } else {
                hash.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hash.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }

    private void quickSort(int[] nums, int low, int high) {
        while (low < high) {
            int pi = partition(nums, low, high);
            if ((pi - low) < (high - pi)) {
                quickSort(nums, low, pi - 1);
                low = pi + 1;
            } else {
                quickSort(nums, pi + 1, high);
                high = pi - 1;
            }
        }
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, high);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}   