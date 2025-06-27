class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Handle empty case
        if (nums.length == 0) return new int[]{-1, -1};

        int left = 0, right = nums.length - 1;
        List<Integer> result = new ArrayList<>();

        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (nums[mid] == target) {
                // Expand to both sides
                int i = mid;
                while (i >= 0 && nums[i] == target) {
                    i--;
                }
                i++; // Move to first valid
                while (i < nums.length && nums[i] == target) {
                    result.add(i);
                    i++;
                }
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result.isEmpty()) {
            return new int[]{-1, -1};
        } else {
            return new int[]{result.get(0), result.get(result.size() - 1)};
        }
    }
}
