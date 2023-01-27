public class findSubset {
    public static void findSubset1(String str, String ans, int index){
        if(index== str.length()){
            if(ans.length()==0){
                System.out.println("null");
                return;
            }
            else{
                System.out.println(ans);
                return;
            }
        }
        char curChar = str.charAt(index);
        findSubset1(str, ans+curChar, index+1);
        findSubset1(str, ans, index+1);
    }
    public static void main(String args[]){
        findSubset1("abc", "", 0);
    }
    
}
