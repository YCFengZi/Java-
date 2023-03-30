import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Employee> employees = new ArrayList<Employee>();
        ArrayList<Person> persons = new ArrayList<Person>();
        String s,name,stuNO,clazz,company,tempString;
        int age;
        boolean gender;
        double salary;
        while (true) {
            s = input.next();
            if (s.equals("s")) {
                name = input.next();
                age = input.nextInt();
                gender = input.nextBoolean();
                stuNO = input.next();
                clazz = input.next();
                Student tempStudent = new Student(name,age,gender,stuNO,clazz,s);
                persons.add(tempStudent);
            } else if(s.equals("e")) {
                name = input.next();
                age = input.nextInt();
                gender = input.nextBoolean();
                salary = input.nextDouble();
                company = input.next();
                Company company1 = new Company(company);
                Employee tempEmployee = new Employee(name,age,gender,salary,company1,s);
                persons.add(tempEmployee);
            } else {
                persons.sort(Comparator.comparing(Person::getName).thenComparingInt(Person::getAge));
                for (Person person : persons) {
                    if (person.getStr().compareTo("s") == 0) {
                        System.out.println("Student:" + person.toString());
                        int flag = 0;
                        for (Student student : students) {
                            if (student.equals(person)) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            students.add((Student) person);
                        }
                    } else {
                        System.out.println("Employee:" + person.toString());
                        int flag = 0;
                        for (Employee employee : employees) {
                            if (employee.equals(person)) {
                                flag = 1;
                                break;
                            }
                        }
                        if (flag == 0) {
                            employees.add((Employee) person);
                        }
                    }
                }
            }
            tempString = input.next();
            if (tempString.compareTo("exit") == 0 || tempString.compareTo("return") == 0) {
                break;
            }
            System.out.println("stuList");
            for (Student student : students) {
                System.out.println("Student:" + student.toString());
            }
            System.out.println("empList");
            for (Employee employee : employees) {
                System.out.println("Employee:" + employee.toString());
            }
        }
    }
}

class Person {
    String name;
    int age;
    boolean gender;
    String str;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Person(String name, int age, boolean gender, String str) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    @Override
    public String toString() {
        return name + "-" + age + "-" + gender;
    }//返回"name-age-gender"格式的字符串
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && gender == person.gender && Objects.equals(name, person.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

}

class Student extends Person {
    private String stuNo;
    private String clazz;

    public Student(String name, int age, boolean gender, String stuNo, String clazz,String str) {
        super(name,age,gender,str);
        this.stuNo = stuNo;
        this.clazz = clazz;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Student:" + super.toString() + "-" + stuNo + "-" + clazz;
    }//返回 “Student:person的toString-stuNo-clazz”格式的字符串
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Student student = (Student) obj;
        return Objects.equals(stuNo, student.stuNo) && Objects.equals(clazz, student.clazz);
    }//首先调用父类的equals方法,如果返回true，则继续比较stuNo与clazz。
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), stuNo, clazz ,str);
    }
}

class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }//直接返回name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Company company = (Company) obj;
        return Objects.equals(name, company.name);
    }//name相同返回true
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Employee extends Person{
    private double salary;
    private Company company;

    public Employee(String name, int age, boolean gender, double salary, Company company,String str) {
        super(name, age, gender, str);
        this.salary = salary;
        this.company = company;
        this.str = str;
    }

    @Override
    public String toString() {
        return "Employee:" + super.toString() + "-" + company + "-" + salary;
    }//返回"Employee:person的toString-company-salary"格式的字符串
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Employee employee = (Employee) obj;
        String  df1 = new DecimalFormat("#.#").format(this.salary);
        String df2 = new DecimalFormat("#.#").format(employee.salary);
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(company, employee.company);
    }//首先调用父类的equals方法,如果返回true。再比较company与salary。
    //比较salary属性时，使用DecimalFormat df = new DecimalFormat("#.#");保留1位小数
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, company ,str);
    }
}