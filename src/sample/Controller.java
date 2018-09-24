package sample;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;

public class Controller implements Initializable{

    @FXML
    private TextField usernameF;
    @FXML
    private PasswordField passwordF;
    @FXML
    private Label label;
    private Button button;
    @FXML
    public void handleButtonAction(ActionEvent e) throws Exception{

        String username = usernameF.getText();
        String password = passwordF.getText();
         System.out.println(username );
        System.out.println(password);
        String providedPassword = password;

        // Encrypted and Base64 encoded password read from database
        String securePassword = "HhaNvzTsVYwS/x/zbYXlLOE3ETMXQgllqrDaJY9PD/U=";

        // Salt value stored in database
        String salt = "EqdmPh53c9x33EygXpTpcoJvc4VXLK";

        boolean passwordMatch = PasswordUtils.verifyUserPassword(providedPassword, securePassword, salt);
        boolean usernameMatch = username.equals("tianhang");
        if(passwordMatch && usernameMatch)
        {
            Stage stageTheLabelBelongs = (Stage) label.getScene().getWindow();

            Parent root = FXMLLoader.load(getClass().getResource("showText.fxml"));

            stageTheLabelBelongs.setScene(new Scene(root));
            System.out.println("Provided user password " + providedPassword + " is correct.");
        } else {
            label.setText("wrong password");
            System.out.println("Provided password is incorrect");
        }

//         FXMLLoader Loader = new FXMLLoader();
//         Loader.setLocation(getClass().getResource("showText.fxml"));
//         try {
//             Loader.load();
//         }catch (IOException ex){
//             Logger.getLogger(DisplayTextController.class.getName()).log(Level.SEVERE,null,ex);
//
//         }
//         DisplayTextController display = Loader.getController();
//         display.setText(username);
//         Parent p = Loader.getRoot();
//         Stage stage= new Stage();
//         stage.setScene(new Scene(p));
//         stage.showAndWait();

    }

    @FXML
    private void handleClose(MouseEvent e){
        System.exit(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
