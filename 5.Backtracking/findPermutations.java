public class findPermutations {
    public static void findPermutations1(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
        }
        for(int i=0; i<str.length(); i++){
            findPermutations1(str.substring(0, i)+str.substring(i+1), ans+str.charAt(i));
        }
    }
    public static void main(String args[]){
        findPermutations1("abcd", "");
    }
    
}
