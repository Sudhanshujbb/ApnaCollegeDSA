/* You are given a number (eg -  2019), convert it into a String of english like "two zero one nine".  
Use a recursive function to solve this problem. NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0.
Sample Input: 1947
Sample Output: "one nine four seven" */
public class AP2 {
    public static String noToString(int n, String str){
        if(n<=0){
            return "";
        }
        str = noToString(n/10, str);
        
        switch(n%10){
            case 0: 
              str = str+"zero ";
              break;
            case 1: 
              str = str+"one ";
              break;
            case 2: 
              str = str+"two ";
              break;
            case 3: 
              str = str+"three ";
              break;
            case 4: 
              str = str+"four ";
              break;
            case 5: 
              str = str+"five ";
              break;
            case 6: 
              str = str+"six ";
              break;
            case 7: 
              str = str+"seven ";
              break;
            case 8: 
              str = str+"eight ";
              break;
            case 9: 
               str += "nine ";
        }

        return str;
    }
    public static void main(String args[]){
       String str = noToString(1947, "");  
       System.out.println(str);
    }
}
