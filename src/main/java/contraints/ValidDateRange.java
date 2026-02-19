package contraints;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import validators.DateRangeValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = DateRangeValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidDateRange {

    String message() default "Конечная дата должна быть после начальной";

    String startDateField();

    String endDateField();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
