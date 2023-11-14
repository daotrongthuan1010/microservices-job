package job.future.com.jobservice.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponse {

    //commit 5

    private final int code;

    private final String message;

}
