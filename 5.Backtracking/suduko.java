public class suduko {
    public static boolean suduko1(int suduko[][], int row){
        if(row == 9){
            printSuduko(suduko);
            return true;
        }
        for(int j = 0; j<9;){
            if(suduko[row][j]==0){
            for(int k =1; k<=9; k++){
                // if(k==7){System.out.println(isSafe(suduko, row, j, k) + " " + row + j + " " + k);}
                if(isSafe(suduko, row, j, k)){
                    suduko[row][j] = k; k=1;j++;
                }
                else if(k==8){
                    k=1;j++;
                }
            }
          }
            
            
        }
        printSuduko(suduko);
        return suduko1(suduko, row+1);
    }

    public static boolean isSafe(int suduko[][], int row, int col, int k){

        //in the row
        for(int j= 0; j<9; j++){
            if(suduko[row][j]==k)
                return false;
        }
       
        // in the column
        for(int i= 0; i<9; i++){
            if(suduko[i][col]==k)
                return false;
        }
       
        // in 3X3 grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j= sc; j<sc+3; j++){
                if(suduko[i][j]==k){
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSuduko(int[][] suduko){
        System.out.println(" =====================-------------=======================");
        for(int i=0; i<9; i++){
            for(int j =0; j<9; j++){
                System.out.print(suduko[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
      int suduko[][] ={{0, 0, 8, 0, 0, 0, 0, 0, 0}, 
                       {4, 9, 0, 1, 5, 7, 0, 0, 2},
                       {0, 0, 3, 0, 0, 4, 1, 9, 0},
                       {1, 8, 5, 0, 6, 0, 0, 2, 0},
                       {0, 0, 0, 0, 2, 0, 0, 6, 0},
                       {9, 6, 0, 4, 0, 5, 3, 0, 0},
                       {0, 3, 0, 0, 7, 2, 0, 0, 4},
                       {0, 4, 9, 0, 3, 0, 0, 5, 7},
                       {8, 2, 7, 0, 0, 9, 0, 1, 3}};
       System.out.println(suduko.length);
       if(suduko1(suduko, 0)){
           System.out.println("Yes, solutionn exist");
       }
       else{
        System.out.println("No, solution do not exist");
       }
    }
}
