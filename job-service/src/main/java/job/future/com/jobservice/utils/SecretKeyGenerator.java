package job.future.com.jobservice.utils;

import jakarta.crypto.KeyGenerator;
import jakarta.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecretKeyGenerator {
    public static SecretKey generateSecretKey() {

        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("HMACSHA256");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(secureRandom);
            return keyGenerator.generateKey();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

    }
}
