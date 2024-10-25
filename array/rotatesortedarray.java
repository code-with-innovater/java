
    public class rotatesortedarray {
        public static int search(int[] nums, int key) {
            int low = 0;
            int high = nums.length - 1;
    
            while (low <= high) {
                int mid = (high + low) / 2;
    
                if (nums[mid] == key) {
                    return mid;
                }
    
                // Determine if the left half is sorted
                if (nums[low] <= nums[mid]) {
                    // If the target is in the left half
                    if (key >= nums[low] && key< nums[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    // If the target is in the right half
                    if (key > nums[mid] && key <= nums[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
    
            return -1;
        }
    
        public static void main(String[] args) {
            int[] nums = {20,30,40,50,60,5,10};
            int key = 30;
    
            int index = search(nums, key);
    
            if (index != -1) {
                System.out.println("Target found at index: " + index);
            } else {
                System.out.println("Target not found.");
            }
        }
    }

