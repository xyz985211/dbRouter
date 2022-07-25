package com.kou.middleware.db.router;

/**
 * @author MiManchi
 * Date: 2022/6/28 9:33
 * Package: com.kou.middleware.db.router
 *
 * 数据源基础配置
 */
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }
}
