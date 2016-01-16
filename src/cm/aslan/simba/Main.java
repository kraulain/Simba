
package Chariot;

import DAO.DBConnect;
import java.sql.Connection;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author kraulain
 */
public class Main extends Application {

    String _nextStage;
    
    @Override
    public void start(Stage primaryStage) {
        login();
        route();
        dummy();
    }

    private void login(){
        LoginStage loginStage = new LoginStage();
        LoginStageControler loginStageControler = new LoginStageControler(loginStage);      
        _nextStage = loginStageControler.getNextStage();
    }
    
    private void route(){
        if(_nextStage.equals("PRESENTER")){
            showPresenterStage();
        }else if(_nextStage.equals("CLERK")){
            showClerkStage();
        }else{
            System.out.println("Oops -- Something Went Wrong");
        }
    }
    
    private void showPresenterStage(){
        PresenterStage presenterStage = new PresenterStage();
        PresenterStageControler presenterStageControler = new PresenterStageControler(presenterStage);
    }
    
    private void showClerkStage(){
        
    }
    
    private void dummy(){
        Connection con = null;
        con = DBConnect.openConnection();
        DBConnect.closeConnection();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    
}
