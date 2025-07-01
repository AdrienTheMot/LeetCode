class Solution {
    public void reverseString(char[] s) {
        
        int b = s.length - 1;
        char temp;

        for(int i = 0; i < s.length/2; i++){

            temp = s[i];
            s[i] = s[b];
            s[b] = temp;
            b--;

        }
    }
}