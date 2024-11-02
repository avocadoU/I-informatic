package org.example.projectinform.Controllers.WindowWord;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.example.projectinform.SpecialMethods.SpecialMethodsClass;

import java.net.URL;
import java.util.ResourceBundle;

public class WindowWordFifeController implements Initializable {

    @FXML
    private Button backMenuStudent;

    @FXML
    private Button closeButton;

    @FXML
    private Label count;

    @FXML
    private Button lastWindow;

    @FXML
    private Button nextWindow;

    @FXML
    private Button taskOneWord;

    @FXML
    private Button taskTwoWord;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpecialMethodsClass.returnMenuWindow(backMenuStudent);

        SpecialMethodsClass.switchWindow(lastWindow, "/Fxml/WindowWord/WindowWordControlWorkFour.fxml");

        SpecialMethodsClass.closeWindow(closeButton);
    }
}
