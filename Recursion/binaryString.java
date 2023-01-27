public class binaryString{
   public static void binaryString1(String str, int lp, int n){
      if(str.length()>=n){
         System.out.println(str);
         return;
      }
      binaryString1(str+"0", 0, n);
      if(lp==0){
         binaryString1(str+"1", 1, n);
      }
   }
   public static void main(String args[]){
      binaryString1("", 0, 3); 
   } 
}
