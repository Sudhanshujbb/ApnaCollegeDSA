public class GridWays {
    public static int gridWays(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i==m || j==n){
            return 0;
        }

        return gridWays(i, j+1, m, n) + gridWays(i+1, j, m, n);
    }
    public static void main(String args[]){
       System.out.println("Number of ways to reach from 0, 0 to 5, 4 = " + gridWays(0, 0, 5, 4));
    }
}
