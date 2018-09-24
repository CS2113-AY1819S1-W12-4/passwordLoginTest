package sample;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
public class DisplayTextController implements Initializable {

    private TextField name, email;

    public void setText(String name){
        this.name.setText(name);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
