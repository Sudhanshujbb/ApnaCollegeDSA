public class AP4 {
    public static int waterTrapped(int bars[]){
        int leftMax[] = new int[bars.length];
        int rightMax[] = new int[bars.length];
        
        leftMax[0] = bars[0];        
        for(int i=1;i<bars.length; i++){
            leftMax[i]= Integer.max(leftMax[i-1], bars[i-1]);
            // System.out.print("("+ i +", " +leftMax[i]+ "), ");
            // System.out.print(leftMax[i] +", ");
        }
              
        rightMax[bars.length-1] = bars[bars.length-1];
        for(int j= bars.length-2;j>=0; j--){
            rightMax[j] = Integer.max(rightMax[j+1], bars[j+1] );
            
        }
        for(int i=0; i<bars.length; i++){
            System.out.print(leftMax[i] +", ");
        }
        System.out.println(leftMax.length);
        for(int i=0; i<bars.length; i++){
            System.out.print(rightMax[i] + ", ");
        }
        System.out.println(rightMax.length);


        int totTrapped = 0;
        for(int i=0;i<bars.length; i++){
            if((Integer.min(leftMax[i], rightMax[i]) - bars[i])>0)
            totTrapped += Integer.min(leftMax[i], rightMax[i]) - bars[i];
        }

        return totTrapped;
    }
    public static void main(String args[]){
        int bars[] = {4, 2, 0, 3, 2, 5};
        for(int i=0; i<bars.length; i++){
            System.out.print(bars[i]+", ");
        }
        System.out.println();
        int totWaterTrapped = waterTrapped(bars);
        System.out.println(totWaterTrapped);
    }
}
