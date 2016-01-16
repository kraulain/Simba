/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chariot;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.StageStyle;

/**
 *
 * @author kraulain
 */
public class LoginStageControler {

    LoginStage stage;

    public LoginStageControler(LoginStage stage) {
        this.stage = stage;
        initialiseStage();
    }

    private void initialiseStage() {
        stage.scene.getStylesheets().add(Main.class.getResource("style.css").toExternalForm());
        //loginStage.root.setGridLinesVisible(true);
        stage.root.add(stage.usernameLabel, 0, 0);
        stage.root.add(stage.usernameTextField, 1, 0);
        stage.root.add(stage.passwordLabel, 0, 1);
        stage.root.add(stage.passwordField, 1, 1);
        stage.root.add(stage.loginAsLabel, 0, 2);
        stage.root.add(stage.loginAsHbox, 1, 2);
        stage.root.add(stage.loginHbox, 1, 3);
        stage.root.setHgap(5);
        stage.root.setVgap(25);
        stage.root.setPadding(new Insets(10, 10, 10, 10));
        stage.loginHbox.setAlignment(Pos.TOP_RIGHT);
        stage.loginAsGroup.getToggles().addAll(stage.clerkRadioButton, stage.presenterRadioButton);
        stage.clerkRadioButton.setSelected(true);

        stage.setScene(stage.scene);
        stage.setTitle("Welcome To Chariot");
        stage.initStyle(StageStyle.UTILITY);

        listenForEvents();
        
        stage.showAndWait();
    }

    private void listenForEvents() {
        stage.loginButton.setOnAction(e -> handleLoginButtonClicked());
    }

    private void handleLoginButtonClicked() {
        stage.close();
    }
    
    public String getNextStage(){
        return "PRESENTER";
    }
}
