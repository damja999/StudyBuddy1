/**
 * Represents a study guide with a title and a list of topics.
 */
public class StudyGuide {
    private String title;
    private List<Topic> topics;

    /** Constructs a StudyGuide. */
    public StudyGuide(String title) {
        this.title = title;
        this.topics = new ArrayList<>();
    }

    /** Adds a topic to this guide. */
    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    /** Returns the list of topics. */
    public List<Topic> getTopics() {
        return topics;
    }
}
