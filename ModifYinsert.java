public class ModifYinsert {
    public static void main(String[] args){
        String str = "Geeks gor Geeks";
        int index = 6 ;
        char ch = 'f';
        System.out .println("original string : " + str);
        str = str.substring(0,index)+ch+str.substring(index+1);
        System.out.println("modified string : "+str);
    }
    
}
