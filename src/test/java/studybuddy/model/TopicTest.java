package studyforge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TopicTest {

    @Test
    public void testAddNoteToTopic() {
        Topic topic = new Topic("Java Basics", "Medium");
        Note note = new Note("Remember to practice for loops.");
        topic.addNote(note);

        assertEquals(1, topic.getNotes().size());
        assertEquals("Remember to practice for loops.", topic.getNotes().get(0).getContent());
    }

    @Test
    public void testTopicPriority() {
        Topic topic = new Topic("Inheritance", "High");
        assertEquals("High", topic.getPriority());
    }
}
