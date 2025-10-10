class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Calculate the middle index to prevent potential integer overflow
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // Target is found at the middle index
                return mid;
            } else if (nums[mid] < target) {
                // Target must be in the right half of the array
                left = mid + 1;
            } else {
                // Target must be in the left half of the array
                right = mid - 1;
            }
        }

        // If the loop finishes, the target was not found.
        // The 'left' pointer now indicates the correct insertion position.
        return left;
    }
}
