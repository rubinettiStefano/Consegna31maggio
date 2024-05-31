import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private String subject;
    private List<Classroom> classrooms;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
        this.classrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    public void addClassroom(Classroom classroom) {
        if (!classrooms.contains(classroom)) {
            classrooms.add(classroom);
            classroom.setProfessor(this);
        }
    }

    @Override
    public String toString() {
        return "Professor{name='" + name + "', subject='" + subject + "'}";
    }
}
