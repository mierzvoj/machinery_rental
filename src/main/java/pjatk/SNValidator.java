package pjatk;


import javax.validation.*;

public class SNValidator implements ConstraintValidator<Catepillar, Integer> {

    @Override
    public boolean isValid(Integer sN, ConstraintValidatorContext constraintValidatorContext) {
        if (sN.equals(1111)) ;
        return true;
    }

    @Override
    public void initialize(Catepillar constraintAnnotation) {

    }


}
