class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                // result = nums[i]==nums[j]?true:false;
                if(nums[i] == nums[j]){
                    result = true;
                }
            }
        }
        return result;
    }
}