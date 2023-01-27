public class BubleSort {
    public static void bubleSort(int[] arr){
      for(int i =0 ; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
      }  
    } 

    public static void selectionSort(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            int max = Integer.MIN_VALUE, pos=i;
            for(int j =i; j<arr.length; j++){
                if(arr[j]>max){
                    max = arr[j];
                    pos =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length;i++){
            
            int currElement = arr[i]; int j =i-1;
            while(j>=0 && currElement>arr[j]){
                arr[j+1]= arr[j];
                j--;
            }
            j++;
            arr[j]= currElement;
            
        }
    }
    public static void countSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        int count[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        for(int i= count.length-1, j=0; i>=0; i--){
            while(count[i]>0){
               arr[j++] = i;
               count[i]--;
            }
        }
    }


    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubleSort(arr);
        
        // selectionSort(arr);

        // insertionSort(arr);
        countSort(arr);
        printArray(arr);
    }
}
