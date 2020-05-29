import java.io.*;
import java.util.Scanner;
public class Decoder {

    public static void main(String[] args, int key) throws FileNotFoundException {
        String encryptedName = args[0];
        String decryptedName = args[1];
        key = -key;
        File encryptedFile = new File(encryptedName);
            Scanner in = new Scanner(encryptedFile);
                     boolean done = false;
        if (decryptedName != null){
       PrintWriter decoded = new PrintWriter(decryptedName);
         while(in.hasNext() && done != true){
             String Text = in.nextLine();
             StringBuilder decode = new StringBuilder();
             for (char c : Text.toCharArray()) {
                decode.append(CeasarCipher.encrypt(c, key));
  }
                decoded.println(decode);
         }
                  decoded.close();

         }
    
         else
         {
              while(in.hasNext() && done != true){
             String Text = in.nextLine();
             StringBuilder decode = new StringBuilder();
             for (char c : Text.toCharArray()) {
                decode.append(CeasarCipher.encrypt(c, key));
  }
         
                   System.out.println(decode);
                   }

         }
             


}

    
}
