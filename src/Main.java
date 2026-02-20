
public class Main {
    public static void main(String[] args) {
        System.out.println("Educational Streaming Platform");

        Course javaCourse = new Course("Java for Champions", "Learn OOP the right way", "Programming", Level.BASIC);
        Lesson lesson1 = new Lesson("L1", "Variables", 15);
        Lesson lesson2 = new Lesson("L2", "Loops", 20);
        
        javaCourse.addLesson(lesson1);
        javaCourse.addLesson(lesson2);

        User user1 = new User("El Parcero", "parcero@colombia.com");

        System.out.println("Enrolling user...");
        Enrollment myEnrollment = user1.enrollInCourse(javaCourse);
        
        System.out.println("Initial progress: " + myEnrollment.calculateProgress() + "%");
        
        System.out.println("Completing the first lesson...");
        myEnrollment.markLessonAsCompleted(lesson1);
        System.out.println("Current progress: " + myEnrollment.calculateProgress() + "%");
        
        System.out.println("Completing the second lesson...");
        myEnrollment.markLessonAsCompleted(lesson2);
        System.out.println("Current progress: " + myEnrollment.calculateProgress() + "%");
        System.out.println("Course status: " + myEnrollment.getStatus());
    }
    
}
