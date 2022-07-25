package com.kou.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @author MiManchi
 * Date: 2022/6/28 9:21
 * Package: com.kou.middleware.db.router.annotation
 *
 * 路由注解
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouter {

    /**
     * 分库分表字段
     */
    String key() default "";
}
