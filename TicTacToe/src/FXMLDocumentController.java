/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.GridLayout;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import java.security.SecureRandom;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author shoaib
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public GridLayout table;
    @FXML
    public TextField t1;
     @FXML
    public TextField t2;
      @FXML
    public TextField t3;
       @FXML
    public TextField t4;
        @FXML
    public TextField t5;
         @FXML
    public TextField t6;
          @FXML
    public TextField t7;
           @FXML
    public TextField t8;
            @FXML
    public TextField t9;
    
    public boolean playerTurn=true;
    public boolean playerWon=false;
    public boolean computerWon=false;
    public boolean check=false;
   
    @FXML
    public void handleText(MouseEvent event) {
        String text=((TextField)event.getSource()).getText();
        if(text.equals("")){
            check=false;
            if(playerTurn==true){
                ((TextField)event.getSource()).setText("X");
                playerTurn=false;
                
                checkWin();
                if(!check){
                computerTurn();
                
            
                checkWin();
                }
                 playerTurn=true;
               
            }
          /*  else
            {
                ((TextField)event.getSource()).setText("O");
                playerTurn=true;
                checkWin();
            }*/
        } 
    }
    @FXML
    public  void checkWin(){
        if(t1.getText().equals("X")){
            if(t2.getText().equals("X")){
                if(t3.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t1.getText().equals("X")){
            if(t5.getText().equals("X")){
                if(t9.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t1.getText().equals("X")){
            if(t4.getText().equals("X")){
                if(t7.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t2.getText().equals("X")){
            if(t5.getText().equals("X")){
                if(t8.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t3.getText().equals("X")){
            if(t5.getText().equals("X")){
                if(t7.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t3.getText().equals("X")){
            if(t6.getText().equals("X")){
                if(t9.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t4.getText().equals("X")){
            if(t5.getText().equals("X")){
                if(t6.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
        if(t7.getText().equals("X")){
            if(t8.getText().equals("X")){
                if(t9.getText().equals("X")){
                    playerWon=true;
                    check=playerWon;
                    computerWon=false;
                }
            }
        }
     if(t1.getText().equals("O")){
            if(t2.getText().equals("O")){
                if(t3.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t1.getText().equals("O")){
            if(t5.getText().equals("O")){
                if(t9.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t1.getText().equals("O")){
            if(t4.getText().equals("O")){
                if(t7.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t2.getText().equals("O")){
            if(t5.getText().equals("O")){
                if(t8.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t3.getText().equals("O")){
            if(t5.getText().equals("O")){
                if(t7.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t3.getText().equals("O")){
            if(t6.getText().equals("O")){
                if(t9.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t4.getText().equals("O")){
            if(t5.getText().equals("O")){
                if(t6.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }
        if(t7.getText().equals("O")){
            if(t8.getText().equals("O")){
                if(t9.getText().equals("O")){
                    playerWon=false;
                    computerWon=true;
                }
            }
        }  
        if((!t1.getText().equals(""))&&(!t2.getText().equals(""))&&(!t3.getText().equals(""))
                &&(!t4.getText().equals(""))&&(!t5.getText().equals(""))&&(!t6.getText().equals(""))
                &&(!t7.getText().equals(""))&&(!t8.getText().equals(""))&&(!t9.getText().equals(""))){
            JOptionPane.showMessageDialog(null,"DRAW");
            String msg=JOptionPane.showInputDialog("Do You Want to PlayAgain?(Y/N)");
    switch(msg){
        case "y":
            case"Y":
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                playerTurn=true;
                playerWon=false;
                computerWon=false;
                check=true;
                break;
            case "n":
                case"N":
                    JOptionPane.showMessageDialog(null,"thanks for Playing.. :)");
                    System.exit(0);
                    break;
            
        }
        }
        if(playerWon==true||computerWon==true){
            
    JOptionPane.showMessageDialog(null,"player 1 Won:  "+playerWon+"player 2 Won:  "+computerWon,"Result",JOptionPane.PLAIN_MESSAGE);
    String ans=JOptionPane.showInputDialog("Do You Want to PlayAgain?(Y/N)");
    switch(ans){
        case "y":
            case"Y":
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                t8.setText("");
                t9.setText("");
                playerTurn=true;
                playerWon=false;
                computerWon=false;
                check=true;
                break;
            case "n":
                case"N":
                    JOptionPane.showMessageDialog(null,"thanks for Playing.. :)");
                    System.exit(0);
                    break;
        }
            
            
            
        }
    }
   
    public void computerTurn(){
        
    SecureRandom ran=new SecureRandom();
    boolean value=false;


while(!value){
    int n=ran.nextInt(8)+1;
    switch(n){
        case 1:
            if(t1.getText().equals("")){
                t1.setText("O");
            value=true;
            }
                
            break;
            case 2:
            if(t2.getText().equals("")){
               t2.setText("O");
            value=true; 
            }
                
            break;
            case 3:
            if(t3.getText().equals("")){
                 t3.setText("O");
            value=true;
            }
               
            break;
             case 4:
            if(t4.getText().equals("")){
                 t4.setText("O");
            value=true;
            }
               
            break;
             case 5:
            if(t5.getText().equals("")){
                 t5.setText("O");
            value=true;
            }
               
            break;
             case 6:
            if(t6.getText().equals("")){
                 t6.setText("O");
            value=true;
            }
               
            break;
             case 7:
            if(t7.getText().equals("")){
                 t7.setText("O");
            value=true;
            }
               
            break;
             case 8:
            if(t8.getText().equals("")){
                 t8.setText("O");
            value=true;
            }
               
            break;
             case 9:
            if(t9.getText().equals("")){
                 t9.setText("O");
            value=true;
            }
               
            break;
    }
}
    
    }
        
       
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}

