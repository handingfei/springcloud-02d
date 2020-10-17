package com.hdf.studentclient.annonation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value= {ElementType.METHOD,ElementType.TYPE})
public @interface Log {
    String desc() default "";
}
