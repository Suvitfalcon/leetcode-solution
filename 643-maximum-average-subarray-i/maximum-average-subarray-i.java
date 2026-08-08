class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double c=0;
        double sum=0;
        double newsum=0;

        for(int i=0;i<k;i++){{
            c+=nums[i];
        
        }
        }
        
        
        sum=c;
        for(int i=k;i<nums.length;i++){
            c+=nums[i];
            c-=nums[i-k];
            sum=Math.max(sum,c);
            
            
            }
        
        newsum=sum/k;
        
        return newsum;
       
    }
    

}