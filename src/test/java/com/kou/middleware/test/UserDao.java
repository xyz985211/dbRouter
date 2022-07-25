package com.kou.middleware.test;

import com.kou.middleware.db.router.annotation.DBRouter;

/**
 * @author MiManchi
 * Date: 2022/6/28 14:49
 * Package: com.kou.middleware.test
 */
public interface UserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);
}
