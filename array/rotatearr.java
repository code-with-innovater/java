import java.util.Arrays;

public class rotatearr {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        // Call the rotate method (which modifies the array in place)
        rotate(nums, k);

        // Print the rotated array
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // In case k is greater than the length of the array
        reverse(nums, 0, n - 1);         // Reverse the entire array
        reverse(nums, 0, k - 1);         // Reverse the first k elements
        reverse(nums, k, n - 1);         // Reverse the rest of the array
    }

    // Helper method to reverse elements in an array between two indices
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
