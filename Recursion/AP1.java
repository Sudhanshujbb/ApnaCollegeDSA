/*For a given integer array of size N.You have to find all the occurrences(indices) of a given element(Key)andprintthem.
Use a recursive function to solve this problem.
Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
Sample Output: 1 5 7 8 */
public class AP1 {
    
    public static void findOccurence(int arr[], int i, int key){
        //base case
        if(i>=arr.length){
            return;
        }
        //kaam
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        findOccurence(arr, i+1, key);
    }
    public static void main(String args[]){
        int arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2;
        findOccurence(arr, 0, key);
    }
}
