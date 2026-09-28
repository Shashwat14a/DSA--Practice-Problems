class Solution {
    static boolean findEmptyCell(char[][] board , int[] emptyCell){
        for(int i=0 ;i < 9 ;i++){
            for(int j=0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                    emptyCell[0] = i;
                    emptyCell[1] = j;
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSafeToPlace(char[][] board , char charValue , int rowIndex , int colIndex){
        // Check For Horizontal Or Same Row
        for(int i = 0; i < 9 ; i++){
            if(board[rowIndex][i] == charValue){
                return false;
            }
        }

        // Check Vertical Or Same Col

        for(int i = 0 ; i < 9 ; i++){
            if(board[i][colIndex] == charValue){
                return false;
            }
        }

        // Sub Box

        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;
         
        for(int i= 0 ; i < 3 ; i++){
            for(int j= 0; j < 3 ; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }

        return true;
    }
    static boolean solveSudokuHelper(char[][] board){
        // Base Case

        int[] emptyCell = new int[2];
        if(!findEmptyCell(board , emptyCell)){
            return true;
        }

        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];

        for(int value = 1 ; value <= 9 ; value++){
            char charValue = (char)(value + '0');
            if(isSafeToPlace(board , charValue , rowIndex , colIndex)){
                board[rowIndex][colIndex] = charValue;
                // Recursion
                if(solveSudokuHelper(board) == true){
                    return true;
                }
                // BackTracking
                board[rowIndex][colIndex] = '.';
            } 
        }

        return false;
    }
    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}