//APPROACH- 1 USING SORTING 

// import java.util.Arrays;

// class Solution{
//     public boolean isAnagram(String s, String t){

//         char[] sChar= s.toCharArray();
//         char[] tChar= t.toCharArray();

// Arrays.sort(sChar);
// Arrays.sort(tChar);

// return Arrays.equals(sChar,tChar);




           
//             }
// }

//APPROACH-2 USING HASHTABLE
// class Solution{
//     public boolean isAnagram(String s, String t){
//         Map<Character, Integer>count=new HashMap<>();

//         //count the frequency of character in string s

//         for(char x:s.toCharArray()){
//             count.put(x,count.getOrDefault(x,0)+1);

//         }
//         //decrement the frequency of charachters in string t

//         for(char x: t.toCharArray()){
//             count.put(x,count.getOrDefault(x,0)-1);

//         }
//         //check if any character has non-zero frequency 

//         for(int val: count.values()){
//             if(val!=0){
//                 return false;

//             }
//         }
//         return true;

//     }
// }
//APPROACH-3 HASH TABLE (USING ARRAY)
class Solution{
    public boolean isAnagram(String s, String t){

        int []count=new int[26];

        //count the frequency of characters in string s

        for(char x: s.toCharArray()){
            count[x-'a']++;

        }
        //decrement the frequency of char in string t
        for(char x:t.toCharArray()){
            count[x-'a']--;

        }
        //check if any char has non-zero frequency

        for(int val:count){
            if(val!=0){
                return false;

            }
        }

return true;

    }

}
