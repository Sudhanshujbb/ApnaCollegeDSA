public class AP1{
   
    public static boolean checkDistinct(int nums[]){
        int arr[] = new int[10];
        for(int i =0; i<nums.length; i++){
          if(arr[nums[i]]++ > 1){
              return false;
          };
      }  
      return true;  
     }


    public static void main(String args[]){    
        int nums[] ={1, 2, 3};    
        System.out.println(checkDistinct(nums));

   }


   
}