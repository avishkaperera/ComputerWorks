/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Avishka Perera
 */
public class User extends Person implements Serializable{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public static String encryptPassword(String password,String salt) {
        try {
            int iterations = 1000;
            int keyLength = 192;
            char[] passwordChars = password.toCharArray();
            byte[] saltBytes = salt.getBytes();
            PBEKeySpec spec = new PBEKeySpec(passwordChars,saltBytes,iterations,keyLength);
            SecretKeyFactory key = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            byte[] hashedPassword = key.generateSecret(spec).getEncoded();            
            return String.format("%x", new BigInteger(hashedPassword));
        } catch (NoSuchAlgorithmException ex) {
            return null;
        } catch (InvalidKeySpecException ex) {
            return null;
        }
    }
}
