/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chariot;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author kraulain
 */
public class LoginStage extends Stage{
    
    Label usernameLabel = new Label("User Name: ");
    Label passwordLabel = new Label("Password: ");
    Label loginAsLabel = new Label("Login as:");
    Button loginButton = new Button("Login");
    TextField usernameTextField = new TextField();
    PasswordField passwordField = new PasswordField();
    RadioButton clerkRadioButton = new RadioButton("Clerk");
    RadioButton presenterRadioButton = new RadioButton("Presenter");
    
    ToggleGroup loginAsGroup = new ToggleGroup();
    
    HBox loginAsHbox = new HBox(5, clerkRadioButton, presenterRadioButton);
    HBox loginHbox = new HBox(loginButton);
    
    GridPane root = new GridPane();
 
    Scene scene = new Scene(root, 460, 280);
}
