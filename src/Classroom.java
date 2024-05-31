import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private Professor professor;
    private List<Student> students;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (this.professor != professor) {
            this.professor = professor;
            professor.addClassroom(this);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addClassroom(this);
        }
    }

    @Override
    public String toString() {
        return "Classroom{name='" + name + "', professor=" + professor + ", students=" + students + "}";
    }
}
