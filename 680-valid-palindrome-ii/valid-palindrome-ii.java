class Solution {
    static boolean isPalin(int i , int j , String s){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while( i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalin(i+1 , j , s) || isPalin(i ,j - 1, s);
            }
            else{
                i++;
                j--;
            }
        }
        return true;

    }
}