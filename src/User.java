

import java.util.ArrayList;
import java.util.List;
public class User {
    private String name;
    private String email;
    private List<Enrollment> enrollments;

    public User(String name, String correo) {
        this.name = name;
        this.email = correo;
        this.enrollments = new ArrayList<>();
    }

    public Enrollment enrollInCourse(Course course) {
        Enrollment newEnrollment = new Enrollment(course);
        enrollments.add(newEnrollment);
        return newEnrollment;
    }

    public List<Course> listCoursesInProgress() {
        List<Course> inProgress = new ArrayList<>();
        for (Enrollment en : enrollments) {
            if (en.getStatus() == EnrollmentStatus.ACTIVE) {
                inProgress.add(en.getCourse());
            }
        }
        return inProgress;
    }
    public String getEmail() { return email; }
    public String getName() { return name; }

}
