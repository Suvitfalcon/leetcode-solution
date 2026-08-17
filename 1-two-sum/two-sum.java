class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0 ;i<nums.length;i++){
            int cones=target-nums[i];

            if (map.containsKey(cones)){
                return new int[]{
                    map.get(cones),i
                };
                
            }
            
            // ?hb

            // jnsds

            
            map.put(nums[i],i);
            
        }



        return new int[] {}; 
    }
}