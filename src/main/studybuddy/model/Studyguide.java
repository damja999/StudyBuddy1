package studyforge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a study guide with a title and a list of topics.
 */
public class StudyGuide {
    private String title;
    private List<Topic> topics;

    public StudyGuide(String title) {
        this.title = title;
        this.topics = new ArrayList<>();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public String getTitle() {
        return title;
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
