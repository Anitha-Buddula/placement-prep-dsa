public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map=new HashMap<>();
        int maxLen=0;
        int l=0;
        for(int r=0; r<s.length();r++){
            char currChar=s.charAt(r);
            if(map.containsKey(currChar))
                l=Math.max(l,map.get(currChar)+1);
            map.put(currChar,r);
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;  
    }
}