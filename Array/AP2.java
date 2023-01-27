public class AP2 {

    public static int findInRotatedArray(int nums[], int target){
         int low =0, high = nums.length-1;

         while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]== target){
                return mid;
            }
            // is left is sorted
            else if(nums[low]<=nums[mid]){
                //if target is in left side
                if(nums[low]>= target && target>= nums[mid-1]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            //right side is sorted
            else{
                if(nums[mid+1]>= target && target>= nums[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
         }
     return -1;
    
    }

    
    public static void main(String args[]){
        int nums[]  = {4,  5, 6, 7, 0, 1, 2};
        int target = 3;
        System.out.print("Index of Target " + findInRotatedArray(nums, target));
    }
}
