class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int hi=nums.length-1;
        int mid=0;

        while(low<=hi){
             mid=(low+hi)/2;
            if(nums[mid] == target){
                return mid;
            }
            if (nums[mid]>target){
                hi=mid-1;
            }
            else{
                low=mid+1;
            }
           
            
        }
         return -1;
        
    }
}
