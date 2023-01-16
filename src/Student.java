import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    /*
     * Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.
     */
    private final String name;
    private final int age;

    public static void main(String[] args) {
        Student st1 = new Student("Полина", 20);
        Student st2 = new Student("Олег", 21);
        Student st3 = new Student("Анна", 22);
        Student st4 = new Student("Ольга", 20);

        System.out.println(st1.equals(st4));

        Map<Student, Integer>map = new HashMap<>();
        map.put(st1, 5);
        map.put(st2, 4);
        map.put(st3, 3);
        map.put(st4, 3);
        System.out.println(map);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st4.hashCode());
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name +
                ", age=" + age ;
    }
    public boolean equals(Object o){
        if (this==o)return true;
        if (o==null|| getClass()!=o.getClass())return false;
        Student student = (Student) o;
        return age==student.age&& Objects.equals(name, student.name);
    }

    public int hashCode(){
        return Objects.hash(name,age);
    }
}

