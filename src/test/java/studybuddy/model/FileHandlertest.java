package studyforge.util;

import studyforge.model.*;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class FileHandlerTest {

    @Test
    public void testSaveGuideToFile() throws IOException {
        // Arrange
        StudyGuide guide = new StudyGuide("Chemistry");
        Topic topic = new Topic("Atoms", "High");
        topic.addNote(new Note("Protons, neutrons, and electrons"));
        guide.addTopic(topic);

        String filename = "test_output.txt";

        // Act
        FileHandler.saveGuide(guide, filename);

        // Assert
        File file = new File(filename);
        assertTrue(file.exists());

        // Optional: Verify contents
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String firstLine = reader.readLine();
            assertTrue(firstLine.contains("Guide: Chemistry"));

            String topicLine = reader.readLine();
            assertTrue(topicLine.contains("Topic: Atoms"));

            String noteLine = reader.readLine();
            assertTrue(noteLine.contains("Protons"));
        }

        // Cleanup
        file.delete();
    }
}
