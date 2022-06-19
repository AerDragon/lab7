package collectionUsage;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CryptoManipulator {

    /**
     * Method for receiving hex string of entered string. Used SHA-1 hex algorithm.
     * @param stringForEncrypt string for encrypting
     * @return hex string
     * @throws NoSuchAlgorithmException if algorithm is not exist
     */
    public String encrypt(String stringForEncrypt){
        String saltForEncrypt = "i_wanna_pass_it";
        String hexString = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(saltForEncrypt.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest(stringForEncrypt.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length ; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hexString = sb.toString();
        }
        catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        return hexString;
    }
}
