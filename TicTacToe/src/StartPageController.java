/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
//import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JFrame;

/**
 * FXML Controller class
 *
 * @author shoaib
 */
public class StartPageController implements Initializable {

    @FXML
    public Button NG;
    @FXML
    public Button About;
    @FXML
    public Button Quit;
    @FXML
    public void HandleNewGame(MouseEvent event){
        try {
            Parent gameBoard = FXMLLoader.load(getClass().getResource("PlayerSelection.fxml"));
            Scene newScene=new Scene(gameBoard);
            Stage app_stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(newScene);
            app_stage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(StartPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @FXML 
    public void HandleQuit(MouseEvent event){
      
         
       Platform.exit();
          
    }
    @FXML
    public void HandleAbout(MouseEvent event){
       About about =new About();
       about.setVisible(true);
       about.setResizable(false);
     //  about.setLocationByPlatform(true);
    
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
