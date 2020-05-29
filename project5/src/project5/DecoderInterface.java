package project5;


import java.io.File;
import java.io.FileNotFoundException;


public interface DecoderInterface {

 boolean add(String data);
 
 
 boolean add(File dataFile)throws FileNotFoundException;
 
 /**
 * Return the raw ECC coded data
 * @return data
 */
 String getCode();
 
 /**
 * Return the number of bits for which an error was detected.
 * @return error count
 */
 int getErrorCount();
 /**
 * Return an error message if the ECC coded data is incomplete
 * @return
 */
 String getErrorMessage();
 
 /**
 * Return a string representation of the decoded data
 * @return decoded message
 */
 String toString();
}