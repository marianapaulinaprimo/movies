//package org.movies.domain.validator;
//import jakarta.validation.Constraint;
//import jakarta.validation.Payload;
//import org.movies.domain.enumeration.ErrorEnum;
//import org.movies.domain.validator.impl.LengthValidator;
//import org.movies.domain.validator.impl.NullOrBlankValidator;
//
//import java.lang.annotation.Documented;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.Target;
//
//import static java.lang.annotation.RetentionPolicy.RUNTIME;
//
//@Target({ ElementType.FIELD })
//@Retention(RUNTIME)
//@Documented
//@Constraint(validatedBy = {NullOrBlankValidator.class})
//public class CustomRequiredField {
//    ErrorEnum value() default ErrorEnum.DEFAULT_VALIDATION_ERROR;
//
//    String message() default "000";
//
//    Class<?>[] groups() default {};
//
//    Class<? extends Payload>[] payload() default {};
//}
