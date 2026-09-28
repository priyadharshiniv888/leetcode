class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i:nums){
       sum=sum+i;
        }
        int lsum=0;
        int rsum;
        for(int i=0;i<nums.length;i++){
            rsum=sum-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum=lsum+nums[i];
        }
        return -1;
    }
}