class Solution {
    static boolean isPalindrome(String s , int left , int right){
        while( left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();

        String result = "";

        for(int i=0 ;i < n ;i++){
            for(int j = i ; j < n ;j++){
                if(isPalindrome(s , i , j)){
                    int length = j - i + 1;
                    if(length > result.length()){
                        result = s.substring( i , j+1);
                    }
                }
            }
        }
        return result;
    }
}