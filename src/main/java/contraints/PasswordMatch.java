package contraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import validators.PasswordMatchValidator;


import java.lang.annotation.*;
import java.util.Arrays;

@Documented
@Constraint(validatedBy = PasswordMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordMatch {

    String message() default "Пароли не совпадают";

    String passwordField() default "newPassword";

    String confirmField() default "confirmPassword";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
