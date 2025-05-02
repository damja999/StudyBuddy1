package studyforge.logic;

import studyforge.model.StudyGuide;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudyGuideManagerTest {

    @Test
    public void testAddGuide() {
        StudyGuideManager manager = new StudyGuideManager();
        StudyGuide guide = new StudyGuide("Math");

        manager.addGuide(guide);

        assertEquals(1, manager.getAllGuides().size());
        assertEquals("Math", manager.getAllGuides().get(0).getTitle());
    }
}
