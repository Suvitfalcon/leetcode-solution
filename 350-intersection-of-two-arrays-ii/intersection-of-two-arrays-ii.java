class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> set =new ArrayList<>();
    boolean[] bol=new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j] && !bol[j]){
                    set.add(nums1[i]);
                    bol[j]=true;
                    break;
                 }
            }
        }
        
        
         int[] arr=new int[set.size()];
        int p=0;
        for(int d:set){
            arr[p++]=d;
        }
        
        


     return arr;
    }
}