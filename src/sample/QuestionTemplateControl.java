package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by micha on 7/9/2017.
 */
public class QuestionTemplateControl extends Application {

    @FXML
    private Stage stage;
    @FXML
    private TextArea questionInput;
    @FXML
    private TextField answer1;
    @FXML
    private TextField answer2;
    @FXML
    private TextField answer3;
    @FXML
    private TextField answer4;
    @FXML
    final ToggleGroup group = new ToggleGroup();
    @FXML
    private RadioButton bt1;
    @FXML
    private RadioButton bt2;
    @FXML
    private RadioButton bt3;
    @FXML
    private RadioButton bt4;
    private Button quizes;
    private Button discard;
    private Button next;
    private Button submit;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;

        Parent root = FXMLLoader.load(getClass().getResource("QuestionTemplate.fxml"));

        primaryStage.setTitle("Questions");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();

        bt1 = new RadioButton();
        bt2 = new RadioButton();
        bt3 = new RadioButton();
        bt4 = new RadioButton();

        questionInput = new TextArea();

        bt1.setToggleGroup(group);
        bt2.setToggleGroup(group);
        bt3.setToggleGroup(group);
        bt4.setToggleGroup(group);


    }

    @FXML
    private void discardButtonAction(ActionEvent event) throws IOException {
        Parent questionTemplate = FXMLLoader.load(getClass().getResource("IntroScreen.fxml"));
        Scene questionScene = new Scene(questionTemplate);
        Stage questionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        questionStage.setScene(questionScene);
        questionStage.show();

    }


    @FXML
    private void quizesButtonAction(ActionEvent event) throws IOException {
        Parent questionTemplate = FXMLLoader.load(getClass().getResource("MyQuizes.fxml"));
        Scene questionScene = new Scene(questionTemplate);
        Stage questionStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        questionStage.setScene(questionScene);
        questionStage.show();

    }

    @FXML
    private void nextButtonAction(ActionEvent event) throws IOException {
        if (questionInput.getText().isEmpty() || answer1.getText().isEmpty()
                || answer2.getText().isEmpty() || answer3.getText().isEmpty()
                || answer4.getText().isEmpty()) {
            makeAlert(Alert.AlertType.WARNING,
                    "Must complete question",
                    "Please make sure to fill out all of "
                            + "the fields and also "
                            + "select which answer is correct.");
        } else {
            makeAlert(Alert.AlertType.WARNING,
                    "Good job this worked.",
                    "Thumbs up dick face.");
        }


    }


    private void makeAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.setHeaderText(null);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

