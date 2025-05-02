package studyforge.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a topic containing notes and a priority.
 */
public class Topic {
    private String name;
    private String priority;
    private List<Note> notes;

    public Topic(String name, String priority) {
        this.name = name;
        this.priority = priority;
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public List<Note> getNotes() {
        return notes;
    }
}
