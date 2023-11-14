package job.future.com.jobservice.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreateCodeJob {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 7;
    private final Random random;
    private final List<String> generatedCodes;

    public CreateCodeJob() {
        random = new Random();
        generatedCodes = new ArrayList<>();
    }

    public String generateJobCode() {
        String jobCode;
        do {
            jobCode = generateRandomCode();
        } while (generatedCodes.contains(jobCode));

        generatedCodes.add(jobCode);
        return jobCode;
    }

    private String generateRandomCode() {
        var sb = new StringBuilder();
        for (var i = 0; i < CODE_LENGTH; i++) {
            var randomIndex = random.nextInt(CHARACTERS.length());
            var randomChar = CHARACTERS.charAt(randomIndex);
            sb.append(randomChar);
        }
        return sb.toString();
    }
}
