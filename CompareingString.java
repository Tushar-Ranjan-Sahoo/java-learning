public class CompareingString {
    public static Boolean stringCompare(String str1,String str2){
        int l1 = str1.length();
        int l2 = str2.length();

        if(l1 != l2){ return false;}
        for(int i = 0 ; i < l1;i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args){
        String str1 = "GeeksforGeeks";
        String str2 = "GeeksfogGeeks";
        if(stringCompare(str1,str2)){
            System.out.println("The two strings are equal");
        }else{
            System.out.println("The two strings are not equal");
        }
    }
}
