//Two pointer O(n)
class Solution {
    public boolean isPalindrome(String s) {

        String str = s.toLowerCase();

        str = str.replaceAll("\\s",""); // remove all space in string
        str = str.replaceAll("[^a-z0-9]",""); // remove all non-alphanumeric

        int i=0,j=str.length()-1;

        while(i<j){

            char ch = str.charAt(i);
            char ch1 = str.charAt(j);

            if(ch==ch1){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
// // HashMap
// class Solution{
// public boolean isPlaindrome(String s){
//     String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

//     Map<Integer,Character>map=new HashMap<>();
//     //put all char into map
//     for(int i=0;i<str.lenght();i++){
//         map.put(i,str.charAt(i));

//     }
//     //check from front and back
//     int n=str.length()-1;
//     boolean check=false;
//     for(int i=0;i<map.size();i++){
//         if(map.get(i)!=str.charAt(n)){
//             return false;

//         }else{
//             n--;

//         }
//     }
// return true;

// }

// }
