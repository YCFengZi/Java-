package net.StudentManger.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource dataSource;
    static {
        try {
            // 使用数据连接池 获取连接对象
            Properties properties = new Properties();
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            // 加载
            properties.load(inputStream);
            // 生成数据源
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
