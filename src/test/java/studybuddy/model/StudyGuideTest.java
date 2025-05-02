package studyforge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudyGuideTest {

    @Test
    public void testAddTopic() {
        StudyGuide guide = new StudyGuide("Biology");
        Topic topic = new Topic("Cells", "High");

        guide.addTopic(topic);

        assertEquals(1, guide.getTopics().size());
        assertEquals("Cells", guide.getTopics().get(0).getName());
        assertEquals("High", guide.getTopics().get(0).getPriority());
    }

    @Test
    public void testEmptyGuideTitle() {
        StudyGuide guide = new StudyGuide("");
        assertEquals("", guide.getTitle());
    }
}
