public class IsNQueen {
   public static boolean isNQueen(char[][] chessBoard, int row){
    boolean isNQueen = false;   
    if(row==chessBoard.length){
        return true;
       }
       for(int j =0; j<chessBoard.length; j++){
        if(isSafe(chessBoard, row, j)){
            chessBoard[row][j] = 'Q';
            isNQueen = isNQueen(chessBoard, row+1);
            if(isNQueen){
                return true;
            }
            chessBoard[row][j]='x';
        }
       }

       return isNQueen;
    }
    public static boolean isSafe(char[][] chessBoard, int row, int col){
        // for up
        for(int i= row-1; i>=0; i--){
            if(chessBoard[i][col]=='Q')
              return false;
        }

        // for left up diagonal
        for(int i= row-1, j= col-1; i>=0 && j>=0; i--, j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        for(int i= row-1, j= col+1; i>=0&& j<chessBoard.length; i--, j++){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void printBoard(char chessBoard[][]){
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                System.out.print(chessBoard[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n =2;
        char chessBoard[][] = new char[n][n];
        for(int i =0;i<n; i++){
            for(int j=0; j<n; j++){
                chessBoard[i][j] = 'x';
            }
        }
        if(isNQueen(chessBoard, 0)){
            System.out.println("Yes, Solution Exist");
        }
        else{
            System.out.println("No, Solution do not exist");
        }
    }
}
