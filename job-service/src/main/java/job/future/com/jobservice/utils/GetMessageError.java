package job.future.com.jobservice.utils;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;


public class GetMessageError {

  private MessageSource messageSource;

  public String getErrorMessage(String key){
    return messageSource.getMessage(key, null, Locale.getDefault());
  }

  public String getErrorMessage(HttpStatus status){
    return messageSource.getMessage("Not_Found", null, Locale.getDefault());
  }
}
