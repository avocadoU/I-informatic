package org.example.projectinform.Controllers.Student;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WindowWordOneController implements Initializable {

    @FXML
    private Button backMenuStudent;

    @FXML
    private Button closeButton;

    @FXML
    private Button taskOneWord;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        backMenuStudent.setOnAction(event -> {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Student/StudentMenu.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root);
                Stage stage = (Stage) backMenuStudent.getScene().getWindow();
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        closeButton.setOnAction(event -> {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        });

        taskOneWord.setOnAction(event -> {

        });
    }
}
