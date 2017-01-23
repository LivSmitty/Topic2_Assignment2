import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by scott_000 on 1/22/2017.
 */
public class JavaFX_VideoStorage extends Application
{

    public static void main(String[] args)
    {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage)
    {



        //create label
        Label lbl720 = new Label();
        Label lbl1080 = new Label();

        lbl720.setText("Amount of Video Storage for 720: ");
        lbl1080.setText("Amount of Video Storage for 1080: ");

        GridPane pane = new GridPane();
        pane.add(lbl720, 0, 1);
        pane.add(lbl1080, 0, 2);


        Scene scene = new Scene(pane, 400, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Video Storage");
        primaryStage.show();

    }
}
