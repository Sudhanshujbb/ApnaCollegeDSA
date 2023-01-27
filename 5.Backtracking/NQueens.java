public class NQueens {
    public static void nQueens(char[][] cb , int i){
        if(i==cb.length){
            pirntCb(cb);
            return;
        }
        for(int j =0; j<cb.length; j++){
            
            if(isSafe(cb, i, j)){
               cb[i][j] = 'Q';               
               nQueens(cb, i+1);
               cb[i][j] = 'x';
            }
            
        }
        
    }
    public static boolean isSafe(char cb[][], int row, int col){
        //for up
        for(int k =row-1; k>=0; k--){
            if(cb[k][col] == 'Q'){
                return false;
            }
        }
        //for left up
        for(int k = row-1, l= col-1; k>=0 && l>=0; k--,l--){
            if(cb[k][l] == 'Q'){
                return false;
            }
        }

        //for right up
        for(int k = row-1, l = col+1; k>=0 && l<cb.length; k--,l++){
            if(cb[k][l]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void pirntCb(char cb[][]){
        System.out.println("========---------=======");
        for(int i=0; i<cb.length; i++){
            for(int j=0; j<cb.length; j++){
                System.out.print(cb[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=4;
        char cb[][] = new char[n][n];
        for(int i=0; i<cb.length; i++){
            for(int j=0; j<cb.length; j++){
                cb[i][j] = 'x';
            }
        } 
        nQueens(cb, 0);
        pirntCb(cb);
        
    }
}
