class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] set=new int[nums.length*2];
        
       for(int i=0;i<nums.length;i++){
        set[i]=nums[i];
        set[i+nums.length]=nums[i];
       }
       return set;
    }
}