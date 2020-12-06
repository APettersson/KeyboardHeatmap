import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    private static String clipboard = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        KeyboardModel kbm = new KeyboardModel();
        VBox vb = new VBox();
        vb.getChildren().addAll(kbm.getModel());

        Pane root = new Pane();
        root.getChildren().add(vb);

        Scene scene = new Scene(root, 450, 150);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(toString().valueOf(event.getCode()).equals("ENTER")){
                    ClipboardContent content = new ClipboardContent();
                    content.putString(clipboard);
                    Clipboard.getSystemClipboard().setContent(content);
                    clipboard = "";
                    kbm.kb.clear();
                    kbm.clear();
                } else {
                    String key = event.getText();
                    clipboard += key;
                    kbm.kb.add(event.getText());
                    kbm.recolour();
                }
            }
        });

        primaryStage.setTitle("Transition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args){
        launch(args);
    }
}
