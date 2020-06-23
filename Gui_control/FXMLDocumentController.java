/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author vip
 */
public class FXMLDocumentController implements Initializable {
    
   
     @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label lb;
     
  
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       if(username.getText().equals("rhm")&&password.getText().equals("1234")){
          
            Parent root = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
               Stage stage =new Stage();
               Scene scene = new Scene(root);
              ((Node)(event.getSource())).getScene().getWindow().hide();
              stage.setScene(scene);
                stage.show();
            }
       else 
            {
                lb.setText("password or username not correct");
            }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
