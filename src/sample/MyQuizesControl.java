package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by micha on 7/9/2017.
 */
public class MyQuizesControl extends Application {

    Button delete;
    Button home;
    Button open;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("MyQuizes.fxml"));

        primaryStage.setTitle("My Quizes");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }

    @FXML
    private void homeButtonAction(ActionEvent event) throws IOException {
        Parent questionTemplate = FXMLLoader.load(getClass().getResource("IntroScreen.fxml"));
        Scene questionScene = new Scene(questionTemplate);
        Stage questionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        questionStage.setScene(questionScene);
        questionStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

