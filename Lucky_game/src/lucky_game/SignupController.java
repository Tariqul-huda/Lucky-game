/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package lucky_game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tariq
 */
public class SignupController implements Initializable {

    @FXML
    private ImageView bg_img;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private TextField fname;
    @FXML
    private RadioButton rb_male;
    @FXML
    private RadioButton rb_female;
    @FXML
    private RadioButton rb_others;
    @FXML
    private Button submit;
    @FXML
    private DatePicker bdate;
    ToggleGroup tg;
    @FXML
    private ImageView back_btn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        RadioButton[] rb_btns = {rb_male,rb_female,rb_others};
        tg = new ToggleGroup();
        for(RadioButton rb_btn:rb_btns){
            rb_btn.setToggleGroup(tg);
        }
        GaussianBlur gauss = new GaussianBlur(10);
        bg_img.setEffect(gauss);
        
        
    }    

    @FXML
    private void handleSubmit(ActionEvent event) {
    }

    @FXML
    private void handleBack(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(new Scene(root));
    }
    
}
