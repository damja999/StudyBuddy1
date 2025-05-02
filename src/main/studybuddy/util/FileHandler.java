package studyforge.util;

import studyforge.model.*;

import java.io.*;
import java.util.List;

/**
 * Utility class for saving study guides to a file.
 */
public class FileHandler {

    /**
     * Saves a StudyGuide to a text file.
     * @param guide The study guide to save
     * @param filename Output file name
     * @throws IOException If file cannot be written
     */
    public static void saveGuide(StudyGuide guide, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Guide: " + guide.getTitle() + "\n");

            for (Topic topic : guide.getTopics()) {
                writer.write("Topic: " + topic.getName() + " (" + topic.getPriority() + ")\n");

                for (Note note : topic.getNotes()) {
                    writer.write(" - " + note.getContent() + "\n");
                }
            }
        }
    }

    // Future: add loadGuide()
}
