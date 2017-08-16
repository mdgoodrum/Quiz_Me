package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    Button newButton;
    Button oldButton;
    private Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("IntroScreen.fxml"));

        primaryStage.setTitle("Quiz Me");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();


    }

    @FXML
    private void newButtonAction(ActionEvent event) throws IOException {
        Parent questionTemplate = FXMLLoader.load(getClass().getResource("QuestionTemplate.fxml"));
        Scene questionScene = new Scene(questionTemplate);
        Stage questionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        questionStage.setScene(questionScene);
        questionStage.show();

    }

    @FXML
    private void oldButtonAction(ActionEvent event) throws IOException {
        Parent myQuizTemplate = FXMLLoader.load(getClass().getResource("MyQuizes.fxml"));
        Scene myQuizScene = new Scene(myQuizTemplate);
        Stage myQuizStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        myQuizStage.setScene(myQuizScene);
        myQuizStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
