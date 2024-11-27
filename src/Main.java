import View.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        SceneManager sceneManager = new SceneManager(primaryStage, WIDTH, HEIGHT);

        sceneManager.switchScene(SceneManager.SceneType.MENU);

        primaryStage.setTitle("E-Card Game");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}