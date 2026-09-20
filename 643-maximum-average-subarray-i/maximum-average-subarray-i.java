class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        if(nums.length == 1){
            return (double) nums[0];
        }

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i< k; i++){
            windowSum += nums[i];
        }
        
        maxSum = windowSum;

        for(int i = k ; i < n ; i++){

            windowSum = windowSum + nums[i] - nums[i-k];

            if(windowSum > maxSum){
                maxSum = windowSum;
            }
        }

        return (double) maxSum / k;

    }
}