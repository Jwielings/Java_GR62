package Class9thOfMay;
import java.util.List;
public class Course {

    Teacher teacher;
    List<Student> students;

    public Course(Teacher teacher, Student Student) {
        this.teacher = teacher;
        this.students = List.of(Student);

    }

    void printDetails() {
        this.teacher.printDetails();
        for (Student student : students) {
            student.printDetails();
        }

    }
}

