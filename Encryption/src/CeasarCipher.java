public class CeasarCipher implements Encryptable {

    private final static int DEFAULT_KEY = 3;
    private int key;

   
    public CeasarCipher(int key) {
        this.key = key;
    }

  
    public static char encrypt(char ch, int key) {
        final int base = ' ';               // The space char
        final int range = '~' - base;
        int shiftedChar = ch + key - base;
        return (char) (shiftedChar + base);
    }

}
