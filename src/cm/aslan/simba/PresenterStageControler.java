/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chariot;

/**
 *
 * @author kraulain
 */
public class PresenterStageControler {
    
    private PresenterStage stage;
    
    public PresenterStageControler(PresenterStage stage){
        this.stage = stage;
        initialiseStage();
    }
    
    private  void initialiseStage(){
        stage.setTitle("Presenter View");
        stage.setScene(stage.scene);
        stage.show();
    }
}
