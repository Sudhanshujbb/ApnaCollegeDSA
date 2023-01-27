public class removeDuplicateString{

    public static void removeDuplicateString1(String str, int index, StringBuilder newStr, boolean map[]){
        if(index> str.length()-1){
            return;
        }
        char currChar = str.charAt(index);

        if(map[currChar-'a'] == true){
            removeDuplicateString1(str, index+1, newStr, map);
        }
        else{
            map[currChar-'a']= true;
            removeDuplicateString1(str, index+1, newStr.append(currChar), map);
        }

    }

    public static void main(String argsp[]) {
        String str = "appnacollege";
        boolean map[] = new boolean[26];
        StringBuilder newStr= new StringBuilder("");
        removeDuplicateString1(str, 0, newStr, map);
        System.out.println(newStr);
    }
}