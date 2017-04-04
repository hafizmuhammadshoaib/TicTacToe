/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author shoaib
 */
public class PlayerSelectionController implements Initializable {
@FXML
public Button onePlayer;
@FXML
public Button twoPlayer;
@FXML
public void HandleOnePlayer(MouseEvent event){
    try{
        Parent gameBoard=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene newScene=new Scene(gameBoard);
        Stage stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(newScene);
        stage.show();
    } catch (IOException ex) {
        Logger.getLogger(PlayerSelectionController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
