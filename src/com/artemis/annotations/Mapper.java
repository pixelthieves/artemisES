package com.artemis.annotations;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Mapper {

}
