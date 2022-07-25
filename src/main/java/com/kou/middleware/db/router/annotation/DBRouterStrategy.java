package com.kou.middleware.db.router.annotation;

import java.lang.annotation.*;

/**
 * @author MiManchi
 * Date: 2022/6/28 9:23
 * Package: com.kou.middleware.db.router.annotation
 *
 * 路由策略，分表标记
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DBRouterStrategy {

    boolean splitTable() default false;
}
