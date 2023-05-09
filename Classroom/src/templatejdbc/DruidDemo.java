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
        // ʹ���������ӳ� ��ȡ���Ӷ���
        Properties properties = new Properties();
        InputStream inputStream = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
        // ����
        properties.load(inputStream);
        // ��������Դ
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        // ������Դ�л�ȡ����
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        // ʹ��JdbcTemplateע������Դ
        JdbcTemplate template = new JdbcTemplate(dataSource);
        // дsql���(��ѯ����ѧ��)
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
