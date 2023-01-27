public class freindsPairing {
    public static int pairFreinds(int n){
        if(n==0||n==1){
            return 1;
        }

        return pairFreinds(n-1) + (n-1)*pairFreinds(n-2);
    }
    public static void main(String arsg[]){
       int n = pairFreinds(5);
       System.out.println(n);
    }
}
