package studyforge.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import studyforge.controller.UIController;

/**
 * Main application class for launching StudyForge using JavaFX.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        UIController controller = new UIController();

        primaryStage.setTitle("StudyForge – Study Guide Builder");
        primaryStage.setScene(new Scene(controller.getMainLayout(), 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
