class Solution {
    public int longestConsecutive(int[] a) {
        HashSet<Integer> h = new HashSet<>();
        int max=0,longest=0,ans=0;
        for(int i:a) h.add(i);
        for(int i:h){
            if(!h.contains(i-1)){
                max=1;
                longest=i;
                while(h.contains(longest+1)){
                    max+=1; longest+=1;
                }
            }
            ans=Math.max(ans,max);
        }
        return ans;
    }
}
