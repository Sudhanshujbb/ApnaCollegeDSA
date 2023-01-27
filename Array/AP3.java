import java.util.*;
public class AP3 {
   public static int getMaxProffit(int[] price){
        int buyPrice = Integer.MAX_VALUE, maxProfit =0;
        for(int i=0; i<price.length; i++){
         if(buyPrice<price[i]){
            int profit = price[i]- buyPrice;
            if(profit>maxProfit){
               maxProfit= profit;
            }
         }else{
            buyPrice= price[i];
         }
        }

        return maxProfit;
   }
    public static void main(String args[]){
   //  int price[] ={7, 1, 5, 3, 6, 4};
   int price[] = {7, 6, 4,  3, 1};
    int maxProfit = getMaxProffit(price);
    System.out.println(maxProfit);
   } 
}
