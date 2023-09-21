//Approach 1(using HASH SET) 
//Time complexity:O(n)
//space complexity:O(n)
 class Solution {
        public boolean containsDuplicate(int[] nums) {
            //declare Hashset to store nums
            Set<Integer>set=new HashSet();
            //iterate over nums array
            for(int i=0;i<nums.length;i++){
                //get num from nums
                int num=nums[i];
                //check if num is already in Hashset, if true return true
                if(set.contains(num))return true;
                //add num into Hashset
                set.add(num);


            }
            //return false if no dublicate found
            return false;
        }
    }

////Approach-3 (using HASH MAP )
//Time complexity:O(n)

/* class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
*/


//Approach-3 (using SORTING )
//Time complexity:O(nlogn)
//space complexity:O(1)
    /*class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])
            return true;

        }
        return false;
    }
}
    */

    //APPROACH -4 (BRUTE FORCE )

  //  Time complexity:O(n^2)
  // space complexity:O(1)
    /*class Solution {
        public boolean constains Duplicate(int []nums){
            int n=nums.lenght;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(nums[i]==nums[j])
                    return true;

                }
            }
            return false;

        }
    }
    */
    
 
