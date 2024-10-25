public class maxsubarray {
    public static int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length ; i++){
            int start = i;
         
            for (int j =i ; j<nums.length;j++){
                int end = j;
                   currsum = 0;
                for (int k = start; k<=end;k++){
                    currsum += nums[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
return maxsum;
    }
    public static void main(String args[]){
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
