import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private double grade;
    private List<Classroom> classrooms;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void addClassroom(Classroom classroom) {
        if (!classrooms.contains(classroom)) {
            classrooms.add(classroom);
            classroom.addStudent(this);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}
