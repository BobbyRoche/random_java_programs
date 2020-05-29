public interface Encryptable {
    default String encrypt(String plainText) {
        return plainText;
    }
    
    default String decrypt(String encryptedText) {
        return encryptedText;
    }
}
