

import java.util.ArrayList;
import java.util.List;
public class Course {
    private String title;
    private String description;
    private String category;
    private Level level;
    private List<Lesson> lessons;

    public Course(String title, String description, String category, Level level) {
        this.title = title;
        this.description = description;
        this.category = category;
        this.level = level;
        this.lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        this.lessons.add(lesson);
    }

    public List<Lesson> getLessons() { return lessons; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }    
    public Level getLevel() { return level; }

}