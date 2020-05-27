package pjatk;

import javax.validation.*;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // kiedy ma działać
@Target(ElementType.FIELD) // czego ma dotyczyć
@Constraint(validatedBy = SNValidator.class)

public @interface Catsn {
    public int key() default 1111;

    String message() default "Invalid SN format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
