package com.mycompany.gui2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class SecondaryController1 {

    @FXML
    private TextField createFirstName;
    @FXML
    private TextField createLastName;
    @FXML
    private TextField createCoachName;
    @FXML
    private Button createAccountButton;
    @FXML
    private TextField gameName;
    @FXML
    private ImageView ramPNG;
    @FXML
    private TextField createEmailUserName;
    
   

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void writeToTxt(ActionEvent event) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(createFirstName.getText().toString()+ "\n");
        sb.append(createLastName.getText().toString()+ "\n");
        sb.append(createCoachName.getText().toString()+ "\n");
        sb.append(createEmailUserName.getText().toString()+ "\n");
        sb.append(gameName.getText().toString()+ "\n");
        sb.append("\n");
       
        
        File file =new File("./src/main/java/Data/login.txt");
        FileWriter W = new FileWriter(file,true);
        Scanner S = new Scanner(file);
        
        W.write(sb.toString());
        W.close();
        
        //Platform.exit();//closes window
    }


}
