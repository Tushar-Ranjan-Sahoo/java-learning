public class CountSubstrs {
    static int countSubstrs(String s1, String s2){
        int ans = 0 ;
        for(int i = 0 ; i< s1.length();i++){
            String s3= "";
            char[] s4 = s1.toCharArray();
            for(int j = i ; j<s1.length();j++){
                s3 += s4[j];
                if(s2.indexOf(s3) != -1){
                    ans++;
                }
            }
            
        }
        return ans;

    }
    public static void main(String[] args){
        String s1 = "aab", s2 = "aaaab";
        System.out.println(countSubstrs(s1,s2));
    }
}
