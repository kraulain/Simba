
package Chariot;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import Entities.Messages;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 *
 * @author kraulain
 */
public class PresenterStage extends Stage{
    Label stationBannerLabel = new Label("Station Banner");
    Label phoneNumberLabel = new Label("Phone Number");
    Label dateLabel = new Label("dd/mm/yyyy");
    Label timeLabel = new Label("hh:mm");
    Label topicLabel = new Label("Topic");
    TextField topicTextField = new TextField("Today's topic here");
    
    VBox dateAndTimeVBox = new VBox(5, dateLabel, timeLabel);
    HBox headerHBox = new HBox(5, stationBannerLabel, phoneNumberLabel, dateAndTimeVBox);
    HBox topicHBox = new HBox(5, topicLabel, topicTextField);
    
    ListView<Messages> newMessageListView = new ListView<>();
    VBox leftVBox = new VBox(5, newMessageListView);
    
    Button previousButton = new Button("Previous");
    Button tickButton = new Button("Tick");
    Button nextButton = new Button("Next");
    TextArea messageArea = new TextArea("sms details");
    HBox messageControls = new HBox(5, previousButton, tickButton, nextButton);
    VBox middleVBox = new VBox(5, messageArea, messageControls);
   
    ListView<Messages> oldMessageListView = new ListView<>();
    Label programStats1 = new Label("stats1");
    Label programStats2 = new Label("stats2");
    Label programStats3 = new Label("stats3");
    VBox statsVBox = new VBox(3, programStats1,programStats2,programStats3);
    VBox rightVBox = new VBox(5, oldMessageListView,statsVBox);
    
    HBox mainContentHBox = new HBox(5, leftVBox,middleVBox,rightVBox);
    
    VBox root = new VBox(10, headerHBox, topicHBox,mainContentHBox);
    
    Scene scene = new Scene(root, 700, 500);
}
