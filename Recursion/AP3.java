// Write a program to findLength of a String using Recursion
public class AP3 {
    public static int countLengthOFString(String str, int index){
        if(index==str.length()-1){
            return 1;
        }

        return countLengthOFString(str, index+1) +1 ;
    }

    public static void main(String args[]){
        System.out.println(countLengthOFString("Hellownull", 0));
    }
}
