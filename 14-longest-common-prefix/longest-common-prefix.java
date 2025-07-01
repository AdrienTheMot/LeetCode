class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        Arrays.sort(strs);

        int c = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];


        while(c < first.length()){

            if(first.charAt(c) == last.charAt(c)){
                c++;
            } else{
                break;
            }
        }

        if(c == 0){
            return "";
        } else{
            return first.substring(0,c);
        }
        
    }
}