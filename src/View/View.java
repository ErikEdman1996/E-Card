package View;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public abstract class View
{
    protected Scene scene;
    protected AnchorPane root;
    protected SceneManager manager;

    public View(int width, int height, SceneManager manager)
    {
        this.root = new AnchorPane();
        this.scene = new Scene(root, width, height);
        this.manager = manager;
        initializeView();
    }

    protected abstract void initializeView();

    public Scene getScene()
    {
        return scene;
    }
}
