public class AP1 {
    public static void mergeSort(String arr[], int si, int ei){
        int mid = (si + ei)/2;
        System.out.println(mid);
        if(ei<=si){
            return;
        }
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        conquer(arr, si, ei, mid);
    }

    public static void conquer(String arr[], int si, int ei, int mid){
        System.out.println(ei-si+1 + " c" + ei + " "+ si);
        String str[] = new String[ei-si+1];
        int i = si, j= mid+1, x=0;
        while(i<=mid && j<=ei){
            if(isAlphabeticallySmaller(arr[i], arr[j])){
                str[x++] = arr[i++];
                System.out.println("\t" + x);  
            }
            
            else{
                str[x++] = arr[j++];
                System.out.println("\t" + x); 
            }
        }

        while(i<=mid){
            str[x++] = arr[i++];
        }

        while(j<=mid){
            str[x++] = arr[j++];
        }
    for(int l = si, m=0; m<str.length; l++, m++){
        arr[l]= str[m];
    }

}

    static boolean isAlphabeticallySmaller(String str1, String str2) {
        if(str1.compareTo(str2) <0) {
            return true;
        }
        return false;
    }
        

    
    public static void printArray(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
    public static void main(String args[]){
        String  arr[] = { "sun", "earth", "mars", "mercury"};
        System.out.println(arr.length);
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    
}
