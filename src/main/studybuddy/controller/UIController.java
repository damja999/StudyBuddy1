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
