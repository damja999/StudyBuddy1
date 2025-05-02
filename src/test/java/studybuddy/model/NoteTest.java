package studyforge.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoteTest {

    @Test
    public void testNoteContent() {
        Note note = new Note("Study polymorphism examples.");
        assertEquals("Study polymorphism examples.", note.getContent());
    }
}
