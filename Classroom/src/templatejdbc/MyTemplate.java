package templatejdbc;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class MyTemplate {
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
    // ��ѯȫ����
    public List<Student> findAllList() throws Exception {
        String sql = "SELECT * FROM student";
        List<Student> list = template.query(sql,new BeanPropertyRowMapper(Student.class));
        return list;
    }
    public List<Map<String, Object>> findAllListMap() throws Exception {
        String sql = "SELECT * FROM student";
        List<Map<String, Object>> list = template.queryForList(sql);
        return list;
    }
    // ��ѯ���֢�
    public Student findByNameStudent(String name) {
        String sql = "SELECT * FROM student WHERE name = ?";
        Student student = template.queryForObject(sql,new BeanPropertyRowMapper<>(Student.class),name);
        return student;
    }
    public Map<String, Object> findByNameMap(String name) {
        String sql = "SELECT * FROM student WHERE name = ?";
        Map<String, Object> map = template.queryForMap(sql,name);
        return map;
    }
    // ��Ӽ�¼
    public int add(Student student) {
        String sql = "INSERT INTO student(id,name,age,gander,address,birthday) values(?,?,?,?,?,?)";
        Object[] args = {student.getId(),student.getName(),student.getAge(),student.getGender(),student.getAddress(),student.getBirthday()};
        int result = template.update(sql,args);
        return result;
    }
    // ɾ����¼
    // �޸ļ�¼
}
