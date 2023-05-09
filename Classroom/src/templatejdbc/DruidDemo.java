package templatejdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        // 使用数据连接池 获取连接对象
        Properties properties = new Properties();
        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        // 加载
        properties.load(inputStream);
        // 生成数据源
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        // 从数据源中获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        // 使用JdbcTemplate注入数据源
        JdbcTemplate template = new JdbcTemplate(dataSource);
        // 写sql语句(查询所有学生)
        String sql = "SELECT * FROM student";
//        List<Student> list = template.query(sql,new BeanPropertyRowMapper(Student.class));
//        for (Student s : list) {
//            System.out.println(s);
//        }
        List<Map<String, Object>> list = template.queryForList(sql);
        for (Map<String, Object> l : list) {
            System.out.println(l);
        }
//        System.out.println(list);
    }
}
