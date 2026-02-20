

public class Lesson {
    private String id;
    private String title;
    private int durationMins;

    public Lesson(String id, String title, int durationMins) {
        this.id = id;
        this.title = title;
        this.durationMins = durationMins;
    }
    
    public String getId() { return id; }
    public String getTitle() { return title; }
    public int getDurationMins() { return durationMins; }
    
}
