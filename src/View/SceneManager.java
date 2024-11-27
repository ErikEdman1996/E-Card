package View;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager
{
    private Stage stage;
    private int width, height;

    public SceneManager(Stage stage, int width, int height)
    {
        this.stage = stage;
        this.width = width;
        this.height = height;
    }

    public void switchScene(SceneType type)
    {
        Scene scene;

        switch (type)
        {
            case MENU:
                scene = new MenuView(width, height, this).getScene();
                break;
            case GAME:
                scene = new GameView(width, height, this).getScene();
                break;
            case RETRY:
                scene = new RetryView(width, height, this).getScene();
                break;
            default:
                throw new IllegalArgumentException("Invalid scene type");
        }

        stage.setScene(scene);
    }

    public enum SceneType
    {
        MENU,
        GAME,
        RETRY;
    }
}


