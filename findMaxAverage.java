class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int result=0;
        int n = nums.length;

       for(int i=0;i<k;i++){
        sum += nums[i];
       }
       result = sum;

        for(int i= k;i< n ;i++){
            sum += nums[i] - nums[i-k];
            result = Math.max(sum , result);

        }

        return (double)result/k;
    }
}
