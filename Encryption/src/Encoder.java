import java.util.*;
import java.io.*;
public class Encoder {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        String inputFileName;
        int key;
        System.out.println("Please enter the input file name: ");
        inputFileName = console.next();
        System.out.println("Please enter the key number: ");
        key = console.nextInt();
         File inFile = new File(inputFileName);
         System.out.println("Please provide the name you would like to store the file under: ");
         String encryptedName = "-i " + console.next();
         PrintWriter out = new PrintWriter(encryptedName);
         Scanner in = new Scanner(inFile);
         boolean done = false;
         while(in.hasNext() && done != true){
             String Text = in.nextLine();
             StringBuilder encode = new StringBuilder();
             for (char c : Text.toCharArray()) {
                encode.append(CeasarCipher.encrypt(c, key));
  }
             out.println(encode);
         }
         out.close();
         System.out.println("Would you like to store the decoded file in another file?('y' ot 'n': ");
         String ans = console.next();
         if("y".equals(ans))
         {
         System.out.println("Enter the file name: ");
         String decryptedFileName = "-o " +console.next();
         PrintWriter decriptedFile = new PrintWriter(decryptedFileName);
        String[] decoderArgs = {encryptedName, decryptedFileName};
        Decoder.main(decoderArgs, key);
         }
         if("n".equals(ans)){
             String[] decoderArgs = {encryptedName, null};
             Decoder.main(decoderArgs, key);
             
         }
    }

}
