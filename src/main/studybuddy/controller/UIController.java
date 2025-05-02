package studyforge.controller;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

/**
 * Controller for building the basic JavaFX interface layout.
 */
public class UIController {
    private VBox layout;

    public UIController() {
        layout = new VBox(10);
        Label welcome = new Label("Welcome to StudyForge – Build Your Study Guide");
        layout.getChildren().add(welcome);

        // Future: add buttons, lists, input forms
    }

    public VBox getMainLayout() {
        return layout;
    }
}
