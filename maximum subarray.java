class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; 
        int currentSum = 0;   

        for (int num : nums) {
            if (currentSum < 0) {
                currentSum = 0; 
            }
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum); 
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(sol.maxSubArray(nums1)); 

        int[] nums2 = {1};
        System.out.println(sol.maxSubArray(nums2)); 

        int[] nums3 = {5,4,-1,7,8};
        System.out.println(sol.maxSubArray(nums3)); 
    }
}
