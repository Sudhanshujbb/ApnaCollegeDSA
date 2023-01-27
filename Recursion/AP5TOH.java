public class AP5TOH{
    public static void TOH(int n, char A, char B, char C){
        if(n==1){
            System.out.println("Move " +  A + " to "+ C);
            return;
        }
        TOH(n-1, A, C, B);
        System.out.println("Move "+ A + " to "+ C);
        TOH(n-1,  B, A, C);
    }
    public static void main(String args[]){
        TOH(3, 'A', 'B', 'C');
    }
}