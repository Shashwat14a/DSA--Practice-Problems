class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(s.length() != t.length()){
            return false;
        }

        // Frequency Array 

        int[] result = new int[26];

        for(int i = 0 ; i < n ; i++){
            result[s.charAt(i) - 'a']++;
            result[t.charAt(i) - 'a']--;
        }

        for(int i= 0 ; i < result.length ; i++){
            if(result[i] != 0){
                return false;
            }
        }
        return true;
    }
}