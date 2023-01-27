public class AP2 {
    public static int majorityElement(int nums[]) {
        int min = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<0 && nums[i]<min){
                min = nums[i];
            }
        }
        int count[] = new int[max-min+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]-min]++;
        }
        int majElement = -1, maxCount= Integer.MIN_VALUE;
        for(int i=0; i<count.length; i++){
            if(count[i]>maxCount){
                maxCount = count[i];
                majElement = i+min;
            }
        }

        return majElement;
    }
    public static void main(String argsp[]){
        int nums[] ={2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
