

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Enrollment {
    private Date date;
    private EnrollmentStatus status;
    private Course course;
    private List<Lesson> completedLessons;

    public Enrollment(Course course) {
        this.date = new Date();
        this.status = EnrollmentStatus.ACTIVE;
        this.course = course;
        this.completedLessons = new ArrayList<>();
    }

    public void markLessonAsCompleted(Lesson lesson) {
        if (!completedLessons.contains(lesson) && status == EnrollmentStatus.ACTIVE) {
            completedLessons.add(lesson);
            updateStatus();
        }
    }

    public double calculateProgress() {
        int totalLessons = course.getLessons().size();
        if (totalLessons == 0) return 0.0;
        return ((double) completedLessons.size() / totalLessons) * 100;
    }

    private void updateStatus() {
        if (calculateProgress() == 100.0) {
            this.status = EnrollmentStatus.COMPLETED;
        }
    }

    public EnrollmentStatus getStatus() { return status; }
    public Course getCourse() { return course; }
    public Date getDate() { return date; }                      



    
}
