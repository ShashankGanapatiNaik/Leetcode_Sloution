class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
           int t1=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(t1==nums[j]){
                    return new int[]{i,j};
                }

            }
        }
         return new int[]{};
    }
}