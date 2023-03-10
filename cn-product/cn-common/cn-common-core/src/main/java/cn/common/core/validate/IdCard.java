package cn.common.core.validate;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Documented
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = IdCardValidator.class)
public @interface IdCard {

	/**
	 * 是否允许为null
	 * @return
	 */
	boolean nullAllowed() default true;
	/**
	 * 是否是身份证
	 * @return
	 */
	boolean isIdentityCard() default true;

	String message() default "身份证号码不合法";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
