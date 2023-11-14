package job.future.com.jobservice.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MessagePropertiesConstants {

  public static final String RESPONSE_400 = "response.jakarta.error_message.bad_request";

  public static final String RESPONSE_403 = "response.jakarta.error_message.forbidden";

  public static final String RESPONSE_404 = "response.jakarta.error_message.not_found";

  public static final String RESPONSE_500 = "response.jakarta.error_message.internal_server";



}
