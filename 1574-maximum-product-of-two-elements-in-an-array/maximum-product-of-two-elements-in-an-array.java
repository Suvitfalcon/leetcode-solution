class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int count=0;
        int set=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>max){
                set=i;
            max=nums[i];

            }

        }
        for (int j=0;j<nums.length;j++){
            if (j!=set && nums[j]>count){
                count=nums[j];
            }
        }
        return (max-1)*(count-1);
    }
}