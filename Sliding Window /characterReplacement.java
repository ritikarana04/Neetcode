class Solution {
    public int characterReplacement(String s, int k) {
        int[] count=new int[26];
        int res=0 ,maxCount=0,l=0;
        //l = left, r = right
        //(r-l+1) window size
        for(int r=0;r< s.length(); r++){
            
            //to calc most occuring char
            //increase the count of the char at the pos
            //max of maxCount and count of that char
            maxCount= Math.max(maxCount, ++count[s.charAt(r)-'A']);
            
            //window size - maxCount = number of char to be replaced
            while((r-l+1) - maxCount > k){
                
                //decrease count of that char and decrease window size
                count[s.charAt(l)-'A']--;
                l++;
                
            }
            
            //max of window
            res= Math.max(res, r-l+1);
        }
        
        return res;
    }
}
