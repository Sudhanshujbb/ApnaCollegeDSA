public class AP3 {
    /**
     * @param nums
     * @param low
     * @param mid
     * @param high
     * @return
     */
    public static int merge(int nums[], int low, int mid, int high){
        int i= low;
        int j= mid;
        int k=0;
        int count=0;
        int temp[] = new int[(high-low+1)];

        System.out.println(high-low+1 +" "+ k);
        
        while(i<mid && j<=high){
            if(nums[i]<nums[j]){
                temp[k++] = nums[i++];
                System.out.println("\t" + k);
            }
            else{
                count+=mid-i;
                temp[k++] = nums[j++];
                System.out.println("\t" + k);
                
            }
        }
        while(i <mid ){
            System.out.println("\t" + k);
            temp[k++] = nums[i++];
        }
            

       while(j <= high){
          temp[k++] = nums[j++];
          System.out.println("\t" + k);
       }
           

        for(i=low,k=0;i<=high;i++,k++){
            nums[i] =temp[k];
        }

    
    return count;

        
    }
    public static int mergeSort(int nums[], int low, int high){
        
        int count=0;
        if(high>low){          
        
        int mid=(low+high)/2;
        count = mergeSort(nums, low, mid);
        count += mergeSort(nums, mid+1, high);
        count+= merge(nums, low, mid+1, high);

        }

        return count;

    }
    public static void main(String args[]){
       int array[] = {468, 335, 1, 170, 225, 479, 359, 463, 465, 206, 146, 282, 328, 462, 492, 496, 443, 328, 437, 392, 105, 403, 154, 293, 383, 422, 217, 219, 396, 448, 227, 272, 39, 370, 413, 168, 300, 36, 395, 204, 312, 323};
       System.out.println(mergeSort(array, 0, array.length-1));
    }
}
