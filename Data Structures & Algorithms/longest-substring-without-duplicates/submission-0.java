class Solution {
    public int lengthOfLongestSubstring(String s) {
     int maxLength = 0;
     for(int i = 0; i < s.length(); i ++){
        for(int j = i; j < s.length(); j ++){
        boolean dup = false;
     
     for(int k = i; k < j; k ++){
        if(s.charAt(k) == s.charAt(j)){
        dup = true;
        break;
        }
     }
     if(dup)
     break;
        maxLength = Math.max(maxLength, j - i + 1);
     } 
     }    
     return maxLength;
    }
}
