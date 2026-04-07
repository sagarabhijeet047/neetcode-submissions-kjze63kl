class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] result = new int[2*len];
        int j = 0;
        for(int i=0; i<result.length;i++){
            if(i<len){
                result[i] = nums[i];
            }
            else if(j<(i+1)){
                result[i] = nums[j++];
            }
        }
        return result;
    }
}