/*class Solution {
    public boolean isValid(String s) {

        int length;

        do{
            
            
            length=s.length();
            s= s.replace("()","").replace("{}","").replace("[]","");

        }
        while(length!=s.length());

        return s.length()==0;
    }
}*/

public class Solution {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening

            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);

            } else {
                // closing
                if (s.isEmpty()) {
                    return false;

                }
                if ((s.peek() == '(' && ch == ')')// ()
                        || (s.peek() == '{' && ch == '}')// {}
                        || (s.peek() == '[' && ch == ']')) {//// []

                    s.pop();

                } else {
                    return false;

                }
            }

        }
        if (s.isEmpty())

        {

            return true;

        } else {
            return false;
        }
    }
}

    /*public static void main(String args[]) {
        String str = "({})[]";// true
        String str="(({})[]"//false
        System.out.println(isValid(str));

    }
}*/
