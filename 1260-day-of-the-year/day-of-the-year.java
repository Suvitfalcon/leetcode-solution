class Solution {
    public int dayOfYear(String date) {
        String[] parts=date.split("-");
        int year=Integer.parseInt(parts[0]);
        int month=Integer.parseInt(parts[1]);
        int day=Integer.parseInt(parts[2]);

        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        int total=0;
        int m=month-1;
        int r=0;
        
        if (month==1){
            total+=day;
        }
        for (int i=0;i<m;i++){
         r+=days[i];
        total=r+day;
        if (year%4==0 && month>2 && year!=1900){
            total+=1;
        }
        }
    
        return total;
        
    }
}