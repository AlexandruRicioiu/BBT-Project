package com.example.bbt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.Random;

public class Controller {
    @FXML Label YouChoice;
    @FXML Label ComputerChoice ;
    @FXML Label WinnerText ;
    @FXML Button buttonLizard ;
    @FXML Button buttonPaper ;
    @FXML Button buttonRock ;
    @FXML Button buttonScissors;
    @FXML Button buttonSpock;
    @FXML Button Restart ;

    boolean choice = false ;
    public int PlayerNumber;
    Random rand = new Random();
    int ComputerNumber = rand.nextInt(5);

    int YouScore = 0;

    public void disabledButton(){
        if(choice) {
            buttonLizard.setDisable(true);
            buttonRock.setDisable(true);
            buttonSpock.setDisable(true);
            buttonPaper.setDisable(true);
            buttonScissors.setDisable(true);
        }
    }

    public void ComputerChoice(){
        if(ComputerNumber == 0){
            ComputerChoice.setText("Computer Choice : Lizard");
        }
        else if (ComputerNumber == 1) {
            ComputerChoice.setText("Computer Choice : Rock");
        }
        else if (ComputerNumber == 2) {
            ComputerChoice.setText("Computer Choice : Spock");
        }
        else if (ComputerNumber == 3) {
            ComputerChoice.setText("Computer Choice : Paper");
        }
        else if (ComputerNumber == 4) {
            ComputerChoice.setText("Computer Choice : Scissors");
        }
    }

    public void WonRules(){
        if(PlayerNumber == 0 && ComputerNumber == 2 || PlayerNumber == 0 && ComputerNumber == 3){
            WinnerText.setText("You Win !");
            YouScore++;
        } else if (PlayerNumber == 0 && ComputerNumber == 1 || PlayerNumber == 0 && ComputerNumber == 4) {
            WinnerText.setText("Computer Win !");
            YouScore--;
        } else if (PlayerNumber == 1 && ComputerNumber == 0 || PlayerNumber == 1 && ComputerNumber == 4) {
            WinnerText.setText("You Win !");
            YouScore++;
        } else if (PlayerNumber == 1 && ComputerNumber == 2 || PlayerNumber == 1 && ComputerNumber == 3) {
            WinnerText.setText("Computer Win !");
            YouScore--;
        } else if (PlayerNumber == 2 && ComputerNumber == 1 || PlayerNumber == 2 && ComputerNumber == 4) {
            WinnerText.setText("You Win !");
            YouScore++;
        } else if (PlayerNumber == 2 && ComputerNumber == 0 || PlayerNumber == 2 && ComputerNumber == 3) {
            WinnerText.setText("Computer Win !");
            YouScore--;
        } else if (PlayerNumber == 3 && ComputerNumber == 1 || PlayerNumber == 3 && ComputerNumber == 2) {
            WinnerText.setText("You Win !");
            YouScore++;
        } else if (PlayerNumber == 3 && ComputerNumber == 0 || PlayerNumber == 3 && ComputerNumber == 4) {
            WinnerText.setText("Computer Win !");
            YouScore--;
        } else if (PlayerNumber == 4 && ComputerNumber == 0 || PlayerNumber == 4 && ComputerNumber == 3) {
            WinnerText.setText("You Win !");
            YouScore++;
        } else if (PlayerNumber == 4 && ComputerNumber == 1 || PlayerNumber == 4 && ComputerNumber == 2) {
            WinnerText.setText("Computer Win !");
            YouScore--;
        } else{
            WinnerText.setText("Draw !");
        }
    }

     public void setButtonLizard (ActionEvent event) {
        YouChoice.setText("You choose : Lizard");
        PlayerNumber = 0;
        choice = true;
        disabledButton();
        ComputerChoice();
        WonRules();
    }
    public void setButtonRock (ActionEvent event) {
        YouChoice.setText("You choose : Rock");
        PlayerNumber = 1;
        choice = true;
        disabledButton();
        ComputerChoice();
        WonRules();
    }
    public void setButtonSpock (ActionEvent event) {
        YouChoice.setText("You choose : Spock");
        PlayerNumber = 2;
        choice = true;
        disabledButton();
        ComputerChoice();
        WonRules();
    }
    public void setButtonPaper (ActionEvent event) {
        YouChoice.setText("You choose : Paper");
        PlayerNumber = 3;
        choice = true;
        disabledButton();
        ComputerChoice();
        WonRules();
    }
    public void setButtonScissors (ActionEvent event) {
        YouChoice.setText("You choose : Scissors");
        PlayerNumber = 4;
        choice = true;
        disabledButton();
        ComputerChoice();
        WonRules();
    }

    public void setRestart (ActionEvent event) throws IOException {
        Main main = new Main();
        main.ChangeScene("Main.fxml");
    }

}