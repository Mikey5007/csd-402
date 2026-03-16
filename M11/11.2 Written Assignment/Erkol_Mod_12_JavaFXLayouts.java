import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 Author: Mirach Erkol
 Assignment: JavaFX Layout Containers
 Description:
 Demonstrates HBox, VBox, and combined layouts in JavaFX.
*/

public class Erkol_Mod_12_JavaFXLayouts extends Application {

    @Override
    public void start(Stage stage) {

        // HBOX EXAMPLE
        Button h1 = new Button("Home");
        Button h2 = new Button("Profile");
        Button h3 = new Button("Settings");

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(h1, h2, h3);


        // VBOX EXAMPLE
        Button v1 = new Button("Login");
        Button v2 = new Button("Register");
        Button v3 = new Button("Help");

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(v1, v2, v3);


        // COMBINED LAYOUT
        VBox mainLayout = new VBox(20);
        mainLayout.getChildren().addAll(hbox, vbox);


        Scene scene = new Scene(mainLayout, 300, 200);

        stage.setTitle("JavaFX Layout Example - HBox and VBox");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}