package job.future.com.jobservice.exception;


import job.future.com.jobservice.utils.ConstanstValidation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
@ControllerAdvice
public class RestExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerNotFound(ClassNotFoundException notFoundException){

       return new ResponseEntity<>(ErrorResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .message(ConstanstValidation.NOT_FOUND)
                .build(), HttpStatus.NOT_FOUND);

    }

}
