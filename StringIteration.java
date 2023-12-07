import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class StringIteration {
public static void traverseString(String str){

    // Using Naive Approach
    //     for(int i = 0 ; i<str.length();i++){
//         System.out.print(str.charAt(i)+" ");
//     }
// }

// Using String.toCharArray() method
// char[] ch = str.toCharArray();
 
// // Traverse the character array
// for (int i = 0; i < ch.length; i++) {

//     // Print current character
//     System.out.print(ch[i] + " ");
// }

// Using CharacterIterator
    // CharacterIterator it = new StringCharacterIterator(str);
    // while(it.current() != CharacterIterator.DONE){
    //     System.out.print(it.current() + " ");
    //     it.next();
    // }

//Using String.split() method

    String[] substring = str.split("");
    for(String ch : substring){
        System.out.print(ch+" ");
    }
}


    public static void main(String[] args){
     traverseString("Geeks for Geeks");
    }
    
}
