package job.future.com.jobservice.exception;


import jakarta.ws.rs.BadRequestException;
import job.future.com.jobservice.utils.MessagePropertiesConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<ErrorResponse> handlerInternalServer(ClassNotFoundException notFoundException){

        return new ResponseEntity<>(ErrorResponse.builder()
                .code(HttpStatus.BAD_REQUEST.value())
                .message(MessagePropertiesConstants.RESPONSE_400)
                .build(), HttpStatus. BAD_REQUEST);

    }

    @ExceptionHandler(ClassNotFoundException.class)
    public ResponseEntity<ErrorResponse> handlerNotFound(){

       return new ResponseEntity<>(ErrorResponse.builder()
                .code(HttpStatus.NOT_FOUND.value())
                .message(MessagePropertiesConstants.RESPONSE_404)
                .build(), HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponse> handlerInternalServer(){

        return new ResponseEntity<>(ErrorResponse.builder()
                .code(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message(MessagePropertiesConstants.RESPONSE_500)
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);

    }




}
