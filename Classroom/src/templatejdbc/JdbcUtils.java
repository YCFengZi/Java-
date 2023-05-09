package templatejdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class JdbcUtils {
    private static DataSource dataSource;
    static {
        try {
            // ʹ���������ӳ� ��ȡ���Ӷ���
            Properties properties = new Properties();
            InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("druid.properties");
            // ����
            properties.load(inputStream);
            // ��������Դ
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
