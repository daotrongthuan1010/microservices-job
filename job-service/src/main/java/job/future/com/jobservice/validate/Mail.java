package job.future.com.jobservice.validate;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import java.lang.annotation.*;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Constraint(validatedBy = {EmailValidator.class})
public @interface Mail {

  String message() default "{response.jakarta.validation.constraints.Mail}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
