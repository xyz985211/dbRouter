package com.kou.middleware.db.router.dynamic;

import com.kou.middleware.db.router.DBContextHolder;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author MiManchi
 * Date: 2022/6/28 10:26
 * Package: com.kou.middleware.db.router.dynamic
 *
 * 动态数据源获取，每当切换数据源，都要从这个里面进行获取
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "db" + DBContextHolder.getDBKey();
    }
}
