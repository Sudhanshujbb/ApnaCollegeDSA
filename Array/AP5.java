public class AP5 {
    public static void main(String args[]){

        int num[] = {};

        for(int i=0; i<num.length; i++){
            for(int j=i+1; j<num.length; j++){
                for(int k=j+1; k<num.length; k++){
                    if((i!=j && i!=k && j!=k) && num[i]+num[j]+num[k] ==0){
                        System.out.print("["+ num[i] + ", " + num[j] + ", " + num[k] + "]");
                    }
                }

                System.out.println();
            }
            System.out.println();
        }
    }
}
