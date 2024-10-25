public class remduplicatearr {
    public static int remove(int nums[]){
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;

    }
    public static void main(String args[]){
        int nums[] = {1, 2, 2, 3, 3, 4, 5};
        int newLength = remove(nums);  // Correct variable name

        // Print the updated array up to the new length
        System.out.print("Your answer is: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

