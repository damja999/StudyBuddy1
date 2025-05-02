package studyforge.logic;

import studyforge.model.StudyGuide;

import java.util.ArrayList;
import java.util.List;

/**
 * Handles storage and retrieval of all study guides.
 */
public class StudyGuideManager {
    private List<StudyGuide> guides;

    public StudyGuideManager() {
        this.guides = new ArrayList<>();
    }

    public void addGuide(StudyGuide guide) {
        guides.add(guide);
    }

    public List<StudyGuide> getAllGuides() {
        return guides;
    }
}
